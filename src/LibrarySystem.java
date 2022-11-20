package src;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class LibrarySystem {
    //you give menu to user add book delete book see books
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to your neighborhood library! ");
        while (true) {
            System.out.println("Do you want to borrow a book or restore a book?");
            String user = in.nextLine().toLowerCase();
            if (user.equals("restore")) {
                BufferedWriter bw;
                FileWriter fw;
                PrintWriter writer;
                try {
                    fw = new FileWriter("myFile.txt", true);
                    bw = new BufferedWriter(fw);
                    writer = new PrintWriter(bw);

                    System.out.println("Got it, please type the book you wish to restore:");
                    String bookNameToRestore = in.nextLine();
                    bookNameToRestore = bookNameToRestore + "\n";
                    writer.write(bookNameToRestore);
                    writer.close();
                    System.out.println("Okay, your book has been restored.");
                    timeDelay(500);

                    System.out.println("Type \"back\" if you want to backward.");
                    timeDelay(800);
                    System.out.println("If you do not want to do anything, type exit.");
                    String userAnswer = in.nextLine().toLowerCase();
                    if (userAnswer.equals("exit")) {
                        System.out.println("Okay, have a great day.");
                        break;
                    } else if(userAnswer.equals("back")){
                        System.out.print("");
                    }else{
                        System.out.println("Couldn't understand that...");
                    }

                } catch (IOException e) {
                    System.out.println("There has been an error.");
                }
            }else if(user.equals("borrow")){
                System.out.println("From our data, it seems like these books are left: ");
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
                System.out.println("Please type the book you wish to borrow from the list above.");
                String removeAnswer = in.nextLine();
                removeLineFromFile(removeAnswer);
                System.out.println("Okay, you can have it.");
                timeDelay(500);

                System.out.println("Type \"back\" if you want to backward.");
                timeDelay(800);
                System.out.println("If you do not want to do anything, type exit.");
                String userAnswer = in.nextLine().toLowerCase();
                if (userAnswer.equals("exit")) {
                    System.out.println("Okay, have a great day.");
                    break;
                } else if(userAnswer.equals("back")){
                    System.out.print("");
                }else{
                    System.out.println("Couldn't understand that...");
                }
            }else{
                System.out.println("Couldn't figure it out...");
            }
        }
    }
    static void removeLineFromFile(String lineToRemove) {

        try {

            File file = new File("myFile.txt");


            //Construct the new file that will later be renamed to the original filename.
            File tempFile = new File(file.getAbsolutePath() + ".tmp");

            BufferedReader br = new BufferedReader(new FileReader("myFile.txt"));
            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
            ArrayList<String> listOfLinesInFile = new ArrayList<>();
            String line = br.readLine();
            while (line != null) {
                listOfLinesInFile.add(line); line = br.readLine();
            }
            for(int i = 0;i<listOfLinesInFile.size();i++){
                if()
            }
            String currentLine;
            //Read from the original file and write to the new
            //unless content matches data to be removed.

            while ((currentLine = br.readLine()) != null) {

                if (!currentLine.trim().equals(lineToRemove)) {

                    pw.println(currentLine);
                    pw.flush();
                }
            }
            pw.close();
            br.close();

            //Delete the original file
            if (!file.delete()) {
                System.out.println("Could not delete file");
                return;
            }

            //Rename the new file to the filename the original file had.
            if (!tempFile.renameTo(file))
                System.out.println("Could not rename file");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    static void timeDelay(int timeInMs) {
        try {
            Thread.sleep(timeInMs);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    static void writerAndReader(Scanner in){
    }
    static void checkWhatBooksAreAvailable(BufferedWriter writer, BufferedReader reader){
    }
    static void removeFromDataCurrentBookToBorrow(Scanner in){
    }
}
