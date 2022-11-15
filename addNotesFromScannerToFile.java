import java.io.*;
import java.util.Scanner;

public class addNotesFromScannerToFile {
    public static void main(String[] args) {
        //create program for user notes when you run a
        //program you should have option to add note to
        // file or read notes
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to note saver! ");
        writerAndReader(in);
        }

    public static void timeSkip(int timeInMs) {
        try {
            Thread.sleep(timeInMs);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    static void writerAndReader(Scanner in){
        while (true) {
        System.out.println("What do you want to do with myFile.txt file (write or read)?");
        String user = in.nextLine().toLowerCase();
        if (user.equals("write")) {
    try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("myFile.txt"));

            System.out.println("Got it, please type the note you wish to add to myFile.txt:");
            String addingNote = in.nextLine();
            writer.write(addingNote);
            writer.close();
            System.out.println("Okay, your note has been added.");
            timeSkip(1000);

            System.out.println("Type \"back\" if you want to backward.");
            timeSkip(800);
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
        }else if(user.equals("read")){
        reader();
        break;
        }else{
        System.out.println("Couldn't figure it out...");
        }
        }
    }
    static void reader(){
        try {
            File myFile = new File("myFile.txt");
            Scanner scannerReader = new Scanner(myFile);
            System.out.print(myFile.getName() + " file is: ");

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
}