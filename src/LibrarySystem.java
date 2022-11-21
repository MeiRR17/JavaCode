package src;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class LibrarySystem {
    //you give menu to user add book delete book see books
    public static void main(String[] args) {
        //create program for user notes when you run a
        //program you should have option to add note to
        // file or read notes
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to your neighborhood library! ");
        writerAndReader(in);
    }

    public static void timeDelay(int timeInMs) {
        try {
            Thread.sleep(timeInMs);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    static void writerAndReader(Scanner in){
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
                    writer.write(bookNameToRestore);
                    System.out.println("Okay, your book has been restored.");

                    writer.close();
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
                System.out.println("From our data, it seems like the following books are left: ");
                //data
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
                //


                try {

                    BufferedReader br = new BufferedReader(new FileReader("myFile.txt"));

                    Scanner scannerReader = new Scanner(br);
                    ArrayList<String> listOfLines = new ArrayList<>();
                    String line = br.readLine();
                    while (line != null) {
                        listOfLines.add(line);
                        line = br.readLine();
                    }
                    br.close();
                    while (scannerReader.hasNextLine()) {
                        String data = scannerReader.nextLine();
                        System.out.println(data);
                    }
                    String wordToDelete = in.nextLine();
                    for (String listOfLine : listOfLines) {
                        if (wordToDelete.equals(listOfLine)) {

                        }
                    }
                    scannerReader.close();
                } catch (FileNotFoundException e) {
                    System.out.println("There has been an error.");
                    e.printStackTrace();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;
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
                listOfLinesInFile.add(line);
                line = br.readLine();
            }
            String currentLine = "";

            for(int i = 0;i<listOfLinesInFile.size();i++){
                if (!currentLine.trim().equals(lineToRemove)) {

                    pw.println(currentLine);
                    pw.flush();

                }
            }
            //Read from the original file and write to the new
            //unless content matches data to be removed.

//            while ((currentLine = br.readLine()) != null) {
//
//                if (!currentLine.trim().equals(lineToRemove)) {
//
//                    pw.println(currentLine);
//                    pw.flush();
//                }
//            }
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
}
