package src.librarySystem;

import java.io.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        ArrayList<User> registered = new ArrayList<>();
        ArrayList<Book> addedBooks = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String currentUserName = "";
        int userCounter = 3;


        System.out.println("welcome to the library.");


        while (true) {
            System.out.println("Select the account you want to log in to.\n(User/Admin)");
            String selectUserType = in.nextLine().toLowerCase();
            if (selectUserType.equals("user")) {
                while (true) {
                    System.out.println("(sign in/register)");
                    String signInOrRegister = in.nextLine().toLowerCase();
                    boolean breakLoop = true;
                    if (signInOrRegister.equals("sign in")) {
                        for (User user : registered) {
                            System.out.println("Enter your account username:");
                            String signUserName = in.nextLine();
                            System.out.println("Enter your password: ");
                            String signPassword = in.nextLine();
                            if (signUserName.equals(user.getUsername()) && signPassword.equals(user.getPassword())) {
                                breakLoop = false;
                                currentUserName = user.getFullName();
                                break;
                            } else {
                                System.out.println("Password or username is not correct, please try again.");
                            }
                        }
                        userCounter--;

                        if (userCounter == 0) {
                            System.out.println("Your account has been locked due to too many attempts...\nPlease try again later.");
                            System.exit(400);
                        }
                    } else if (signInOrRegister.equals("register")) {
                        System.out.println("Enter your full name: ");
                        String registerFullName = in.nextLine();
                        System.out.println("Enter a username: ");
                        String registerUserName = in.nextLine();
                        System.out.println("Enter a password: ");
                        String registerPassword = in.nextLine();

                        registered.add(new User(registerFullName, registerUserName, registerPassword));

                        addObjectToAFile(registered.get(registered.size()-1), "people.txt");
                        System.out.println("Your user has been added to the system.");
                        timeDelay();
                        continue;
                    } else {
                        System.out.println("Could not understand what you typed...");
                        timeDelay();
                    }


                    System.out.println("You logged in successfully to an user type account!");
                    signInGreeting(currentUserName);
                    while (true) {
                        System.out.println("Do you want to borrow a book or restore a book?");
                        String user = in.nextLine();
                        if (user.equals("restore")) {
                            System.out.println("Got it, please type the book you wish to restore:");
                            String restore = in.nextLine();
//                        addBooks(restore);


                            System.out.println("Type \"back\" if you want to backward.");

                            timeDelay();

                            System.out.println("If you want to do exit, type exit.");
                            String userAnswer = in.nextLine().toLowerCase();
                            if (userAnswer.equals("exit")) {
                                System.out.println("Okay, have a great day.");
                                break;
                            } else if (userAnswer.equals("back")) {
                                System.out.print("");
                            } else {
                                System.out.println("Couldn't understand that...");
                            }
                        } else if (user.equals("borrow")) {

//                        showBookStock();


                            System.out.println("\nPlease type the book you wish to borrow from the list above.");

                            String answer = in.nextLine();
                            removeAnObjectFromAFile(answer, "people.txt");

                            System.out.println("If you want to go backward, type back.");
                            timeDelay();
                            System.out.println("If you want to exit, type exit.");
                            String userChoice = in.nextLine().toLowerCase();

                            if (userChoice.equals("exit")) {
                                System.out.println("Okay, have a great day.");
                                break;
                            } else if (userChoice.equals("back")) {
                                System.out.print("");
                            } else {
                                System.out.println("I could not understand what you typed...");
                            }
                        } else {
                            System.out.println("I could not understand what you typed...");
                            timeDelay();
                        }
                    }
                }



            } else if (selectUserType.equals("admin")) {
                while(true){
                    try{
                        File file = new File("admin.txt");
                        BufferedReader reader = new BufferedReader(new FileReader("admin.txt"));
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
                    while(true) {
                        if (controlOption.equals("books")||controlOption.equals("book")) {
                            System.out.println("(add/remove)");
                            while(true) {
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
                                } else if (addOrRemoveBooks.equals("remove") || addOrRemoveBooks.equals("remove books")) {
                                    System.out.println("Enter the name of the book you want to delete:");
                                    String nameOfBookToDelete = in.nextLine();
                                    for(int i = 0;i<addedBooks.size();i++){
                                        if(nameOfBookToDelete.equals(addedBooks.get(i).getTitle())){
                                            addedBooks.remove(i);

                                        }
                                    }
                                } else {
                                    System.out.println("Couldn't understand that...");
                                    addOrRemoveBooks = in.nextLine().toLowerCase();
                                }
                            }
                        } else if (controlOption.equals("users")||controlOption.equals("user")) {

                        }else{
                            System.out.println("Couldn't understand that...");
                            controlOption = in.nextLine().toLowerCase();
                        }
                    }
                }
            } else {
                System.out.println("Could not understand that...");
                selectUserType = in.nextLine().toLowerCase();
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

}
