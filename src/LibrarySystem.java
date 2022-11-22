package src;

import java.io.*;
import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to your neighborhood library! ");
        timeDelay();
        while(true){
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
                } else if(userAnswer.equals("back")){
                    System.out.print("");
                }else{
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
                } else if(userChoice.equals("back")){
                    System.out.print("");
                }else{
                    System.out.println("I could not understand what you typed...");
                }
            }else{
                System.out.println("I could not understand what you typed...");
                timeDelay();
            }
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
                    pw.flush();
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
    static void timeDelay() {
        try {
            Thread.sleep(800);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
