import java.io.*;
import java.util.Scanner;

public class fileHandlingWriteAndPrint {
    public static void main(String[] args) {
        String[] numbers = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("words.txt"));
            writer.write("This file is for showing ten words created by java:\n");
                for (String num : numbers) {
                    writer.write(num + ",");
                }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            File myFile = new File("words.txt");
            Scanner scannerReader = new Scanner(myFile);
            while (scannerReader.hasNextLine()) {
                String data = scannerReader.nextLine();
                System.out.println(data);
            }
            scannerReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
