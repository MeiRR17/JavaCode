package src.librarySystem;

import java.io.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    static void timeDelay() {
        try {
            Thread.sleep(800);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public static int timeInDay() {
        LocalTime time = LocalTime.now();
        return time.getHour();
    }

    public static void signInGreeting(String currentUserName) {
        if (timeInDay() >= 12 && timeInDay() < 17) {
            System.out.println("Good afternoon " + currentUserName + ".");
        } else if (timeInDay() >= 17 && timeInDay() < 21) {
            System.out.println("Good evening " + currentUserName + ".");
        } else if (timeInDay() >= 21 && timeInDay() < 5) {
            System.out.println("Good night " + currentUserName + ".");
        } else {
            System.out.println("Good morning " + currentUserName + ".");
        }
    }
    static void removeABookFromStock(String lineToRemove) {
        try {
            File fileTxt = new File("myFile.txt");
            File assistFile = new File(fileTxt.getAbsolutePath() + ".tmp");

            BufferedReader br = new BufferedReader(new FileReader(fileTxt));
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

            if (!fileTxt.delete()) {
                System.out.println("Could not delete file");
                return;
            }
            if (!assistFile.renameTo(fileTxt)) {
                System.out.println("Could not rename file");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    static void showBookStock(){
        System.out.println("From our data, it seems like these books are left: \n");
        try {
            File myFile = new File("myFile.txt");
            Scanner scannerReader = new Scanner(myFile);


            while (scannerReader.hasNextLine()) {
                String data = scannerReader.nextLine();
                System.out.println(data);
            }
            scannerReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("There has been an error.");
            e.printStackTrace();
        }
    }
    static void addBooks(String bookNameToRestore) {
        FileWriter fw;
        BufferedWriter bw;
        PrintWriter pw;
        try {
            fw = new FileWriter("myFile.txt", true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);

            bookNameToRestore = bookNameToRestore + "\n";
            pw.write(bookNameToRestore);
            pw.close();
            System.out.println("Okay, your book has been restored.");

        } catch (IOException e) {
            System.out.println("There has been an error.");
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        ArrayList<User> registered = new ArrayList<>();
        ArrayList<Book> addedBooks = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String currentUserName = "";
        System.out.println("welcome to the library.");
        System.out.println("Select the account type you would like to use");
        System.out.println("(User/Admin)");


        boolean select = false;
        int counter = 3;

        String selectUser = in.nextLine();
        while (true) {

            while (!selectUser.equals("user")) {
                if (selectUser.equals("admin")) {
                    select = true;
                    break;
                }
            }
            System.out.println("sign in/register");
            String signInOrRegister = in.nextLine().toLowerCase();
            if (signInOrRegister.equals("sign in")) {

                System.out.println("Enter your account username:");
                String signUserName = in.nextLine();
                System.out.println("Enter your password: ");
                String signPassword = in.nextLine();

                boolean breakLoop = true;
                for (User user : registered) {
                    if (signUserName.equals(user.getUsername()) && signPassword.equals(user.getPassword())) {
                        breakLoop = false;
                        currentUserName = user.getFullName();
                        break;
                    } else {
                        System.out.println("Password or username is not correct, please try again.");
                    }
                }
                if (!breakLoop) {
                    break;
                }
                counter--;

                if (counter == 0) {
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

                System.out.println("Okay, your account has been created.");

            } else {
                System.out.println("Could not understand what you typed...");
                timeDelay();
            }
        }









        while (true) {
            if (select) {//admin
                System.out.println("You logged in successfully to an admin type account!");
                signInGreeting(currentUserName);
                System.out.println("Do you want to add new books or remove particular books?");
                String addOrRemove = in.nextLine().toLowerCase();

                if (addOrRemove.equals("add")) {
                    System.out.println("Got it, first type the title of the book:");
                    String bookTitle = in.nextLine();
                    System.out.println("Got it, type the book's author:");
                    String bookAuthor = in.nextLine();
                    System.out.println("Okay, now type the year this book was published:");
                    int bookPublishYear = in.nextInt();

                    System.out.println("How many pages does this book has?");
                    int bookNumOfPages = in.nextInt();

                    addedBooks.add(new Book(bookTitle, bookAuthor, bookPublishYear, bookNumOfPages));

                } else if (addOrRemove.equals("remove")) {

                    showBookStock();

                    System.out.println("Okay, please type the full name of the book from the list above:");
                    String removeBookName = in.nextLine();
                    System.out.println("Also, for safer removing, please type the year of release of the current book.");
                    String removeBookYearOfRelease = in.nextLine();

                    String removeABook = in.nextLine();
                    removeABookFromStock(removeABook);

                    boolean breakLoop = true;
                    for (Book book : addedBooks) {
                        if (removeBookName.equals(book.getTitle()) && removeBookYearOfRelease.equals(String.valueOf(book.getYearOfRelease()))) {
                            addedBooks.remove(book);
                            breakLoop = false;
                            break;
                        } else {
                            System.out.println("We couldn't find the book...");
                        }
                    }
                    if (!breakLoop) {
                        break;
                    }
                } else {
                    System.out.println("Couldn't understand what you typed...");
                }


            } else {//user
                System.out.println("You logged in successfully to an user type account!");
                signInGreeting(currentUserName);
                while (true) {
                    System.out.println("Do you want to borrow a book or restore a book?");
                    String user = in.nextLine();
                    if (user.equals("restore")) {
                        System.out.println("Got it, please type the book you wish to restore:");
                        String restore = in.nextLine();
                        addBooks(restore);

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

                        showBookStock();

                        System.out.println("\nPlease type the book you wish to borrow from the list above.");

                        String answer = in.nextLine();
                        removeABookFromStock(answer);

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


        }

    }
}
