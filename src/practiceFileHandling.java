package src;

import java.io.*;
import java.util.Arrays;

public class practiceFileHandling {
    public static void main(String[] args) {
        int [] names = new int[10];
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("This is a file");
            writer.write("\nHere is another line in the file.");
            writer.close();
            for(int i = 0;i< names.length;i++){
                names[i] += i;
                writer.write("\n" + i);
                System.out.println(Arrays.toString(names));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
                System.out.println(reader.readLine());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
