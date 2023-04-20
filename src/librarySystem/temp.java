package src.librarySystem;

import java.awt.*;
import java.io.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class temp {

    public static void main(String[] args) {
        ArrayList<User> registered = new ArrayList<>();
        ArrayList<Book> addedBooks = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String currentUserName = "";


        System.out.println("welcome to the library.");


        while (true) {
            System.out.println("Select the account you want to log in to.\n(User/Admin)");
            String selectUserType = in.nextLine().toLowerCase();
            if (selectUserType.equals("user")) {
                System.out.println("(sign in/register)");
                String signInOrRegister = in.nextLine().toLowerCase();
                while (true) {
                    boolean breakFromWhileLoop = false;
                    if (signInOrRegister.equals("sign in")) {
                        int userCounter = 3;
                        System.out.println("Enter your account username:");
                        String signUserName = in.nextLine();
                        System.out.println("Enter your password: ");
                        String signPassword = in.nextLine();

                        signInUser(registered, signUserName, signPassword, currentUserName, userCounter);
                        if(signInUser(registered, signUserName, signPassword, currentUserName, userCounter)){
                            break;
                        }
                    } else if (signInOrRegister.equals("register")) {
                        System.out.println("Enter your full name: ");
                        String registerFullName = in.nextLine();
                        System.out.println("Enter a username: ");
                        String registerUserName = in.nextLine();
                        System.out.println("Enter a password: ");
                        String registerPassword = in.nextLine();

                        addUser(registered, registerFullName, registerUserName, registerPassword);
                        signInOrRegister = in.nextLine().toLowerCase();

                    } else {
                        System.out.println("Could not understand what you typed...");
                    }
                }



                    while (true) {
                        System.out.println("Do you want to borrow a book or restore a book?");
                        String user = in.nextLine();


                            if (user.equals("restore")) {

                                String userAnswer = in.nextLine().toLowerCase();
//                                returnBook(userAnswer);









                            } else if (user.equals("borrow")) {

//                        showBookStock();





                            } else {
                                System.out.println("I could not understand what you typed...");
                            }
                    }


            } else if (selectUserType.equals("admin")) {
                    while (true) {
                        File file = new File("admin.txt");
                        try {
                            BufferedReader reader = new BufferedReader(new FileReader(file));
                            ArrayList<String> developerCode = new ArrayList<>();
                            String line = reader.readLine();
                            while (line != null) {
                                developerCode.add(line);
                                line = reader.readLine();

                                reader.close();

                                System.out.println("Enter an engineer code.");
                                int adminCounter = 3;
                                for (String code : developerCode) {
                                    String engineerCode = in.nextLine();
                                    if (engineerCode.equals(code)) {
                                        break;
                                    } else {
                                        System.out.println("Engineer code is not on the system.");
                                        adminCounter--;
                                        if (adminCounter == 0) {
                                            System.out.println("Too many attempts, please try again later...");
                                            System.exit(400);
                                        }
                                    }
                                }
                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }


                        System.out.println("(books/users)");
                        String controlOption = in.nextLine().toLowerCase();
                        while (true) {
                            if (controlOption.equals("books") || controlOption.equals("book")) {
                                System.out.println("(add/remove)");
                                while (true) {
                                    String addOrRemoveBooks = in.nextLine().toLowerCase();
                                    if (addOrRemoveBooks.equals("add") || addOrRemoveBooks.equals("add books")) {
                                        System.out.println("Enter the book title: ");
                                        String title = in.nextLine();
                                        System.out.println("Enter book's author name: ");
                                        String authorsName = in.nextLine();
                                        System.out.println("Enter the year of release: ");
                                        int releaseYear = in.nextInt();
                                        System.out.println("Enter the number of pages:");
                                        int numberOfPages = in.nextInt();

                                        addedBooks.add(new Book(title, authorsName, releaseYear, numberOfPages));
                                        addObjectToAFile(String.valueOf(addedBooks.get(addedBooks.size() - 1)), "availableBooks.txt");
                                        System.out.println("The book has been added to the system.");
                                        timeDelay();
                                        continue;
                                    } else if (addOrRemoveBooks.equals("remove") || addOrRemoveBooks.equals("remove books")) {
                                        System.out.println("Enter the name of the book you want to delete:");
                                        String nameOfBookToDelete = in.nextLine();
                                        for (int i = 0; i < addedBooks.size(); i++) {
                                            if (nameOfBookToDelete.equals(addedBooks.get(i).getTitle())) {
                                                addedBooks.remove(i);
                                                removeAnObjectFromAFile(nameOfBookToDelete, "books.txt");
                                            }
                                        }
                                    } else {
                                        System.out.println("Couldn't understand that...");
                                        addOrRemoveBooks = in.nextLine().toLowerCase();
                                    }
                                }
                            } else if (controlOption.equals("users") || controlOption.equals("user")) {

                            } else {
                                System.out.println("Couldn't understand that...");
                                controlOption = in.nextLine().toLowerCase();
                            }
                        }
                    }
                }
          } //else {
//                System.out.println("Could not understand that...");

        }

























static void borrowBook(String answer, String userChoice){
    while (true) {
        System.out.println("\nPlease type the book you wish to borrow from the list above.");

        removeAnObjectFromAFile(answer, "people.txt");

        System.out.println("If you want to go backward, type back.");
        timeDelay();
        System.out.println("If you want to exit, type exit.");

        if (userChoice.equals("exit")) {
            System.out.println("Okay, have a great day.");
            break;
        } else if (userChoice.equals("back")) {
            System.out.print("");
        } else {
            System.out.println("I could not understand what you typed...");
        }
    }
}
    static void returnBook(String userAnswer, String userReturnsBook) {
        System.out.println("Got it, please type the title of the book you wish to restore:");

        while (true) {

            System.out.println("Type \"back\" if you want to backward.");

            timeDelay();

            System.out.println("If you want to do exit, type exit.");
            if (userAnswer.equals("exit")) {
                System.out.println("Okay, have a great day.");
                break;
            } else if (userAnswer.equals("back")) {
                System.out.print("");
            } else {
                System.out.println("Couldn't understand that...");
            }
        }
    }
    static void timeDelay() {
        try {
            Thread.sleep(800);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public static void signInGreeting(String currentUserName) {
        int time = LocalTime.now().getHour();
        if (time >= 12 && time < 17) {
            System.out.println("Good afternoon " + currentUserName + ".");
        } else if (time >= 17 && time < 21) {
            System.out.println("Good evening " + currentUserName + ".");
        } else if (time >= 21 || time < 5) {
            System.out.println("Good night " + currentUserName + ".");
        } else {
            System.out.println("Good morning " + currentUserName + ".");
        }
    }

    static void removeAnObjectFromAFile(String lineToRemove, String fileName) {
        try {
            File mainFile = new File(fileName);
            File assistFile = new File(mainFile.getAbsolutePath() + ".tmp");

            BufferedReader br = new BufferedReader(new FileReader(mainFile));
            PrintWriter pw = new PrintWriter(new FileWriter(assistFile));


            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                if (!currentLine.trim().equals(lineToRemove)) {
                    pw.println(currentLine);
                }
            }
            System.out.println("Okay you can have it.");
            timeDelay();
            pw.close();
            br.close();

            if (!mainFile.delete()) {
                System.out.println("Could not delete file");
                return;
            }
            if (!assistFile.renameTo(mainFile)) {
                System.out.println("Could not rename file");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    static void showBookStock(Object users) {

        System.out.println("From our data, it seems like these books are left: \n");
        try {
            File myFile = new File("src/librarySystem/people.txt");
            Scanner scannerReader = new Scanner(myFile);


            while (scannerReader.hasNextLine()) {
                Object data = scannerReader.nextLine();
                System.out.println(data);
            }
            scannerReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("There has been an error.");
            e.printStackTrace();
        }
    }

    static void addObjectToAFile(Object users, String file) {
        FileWriter fw;
        BufferedWriter bw;
        PrintWriter pw;
        try {
            fw = new FileWriter(file, true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);

            users = users + "\n";
            pw.write(String.valueOf(users));
            pw.close();
            System.out.println("Okay, your book has been restored.");

        } catch (IOException e) {
            System.out.println("There has been an error.");
            e.printStackTrace();
        }
    }

    static void writeObjectInsideFile(User user) {

        try {

            FileOutputStream fileOut = new FileOutputStream("users.txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(user);
            objectOut.close();
            System.out.println("Okay, your account has been created.");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    static void addUser(ArrayList<User> registered, String registerFullName, String registerUserName, String registerPassword){
        registered.add(new User(registerFullName, registerUserName, registerPassword));

        addObjectToAFile(registered.get(registered.size() - 1), "people.txt");
        System.out.println("Your user has been added to the system.");


    }
    static boolean signInUser(ArrayList<User> registered, String signUserName, String signPassword, String currentUserName, int userCounter){
        boolean exitPoint = false;
        while(!exitPoint) {
            for (User user : registered) {
                if (signUserName.equals(user.getUsername()) && signPassword.equals(user.getPassword())) {
                    currentUserName = user.getFullName();
                    break;
                } else {
                    System.out.println("Password or username is not correct, please try again.");
                }
                userCounter--;
                if (userCounter == 0) {
                    System.out.println("Your account has been locked due to too many attempts...\nPlease try again later.");
                    System.exit(400);
                }
                exitPoint = true;
            }

        }
        System.out.println("You logged in successfully to an user type account!");
        signInGreeting(currentUserName);
        return true;
    }
}
