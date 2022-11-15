package src;

import java.io.*;

public class practiceFileHandling {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("This is a file");
            writer.write("\nHere is another line in the file.");
            File myFile0 = new File("fileName.txt");
            if(myFile0.createNewFile()){
                System.out.println(myFile0 + "was created.");
            }
            File myFile = new File("C:\\Users\\MyName\\filename.txt");

            if(myFile.exists()){
                System.out.println("Absolute path: " + myFile.getAbsolutePath());
                System.out.println("File name: " + myFile.getName());
                System.out.println("Absolute path: " + myFile.getAbsolutePath());
                System.out.println("Writeable: " + myFile.canWrite());
                System.out.println("Readable " + myFile.canRead());
                System.out.println("File size in bytes " + myFile.length());
            }else{
                System.out.println("Current file doesn't exist.");
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader("output.txt"));
            BufferedReader reader0 = new BufferedReader(new FileReader("fileName.txt"));
            BufferedReader reader = new BufferedReader(new FileReader("fileName.txt"));

            System.out.println(reader1.readLine());
            System.out.println(reader0.readLine());
            System.out.println(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
