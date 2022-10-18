import java.util.Arrays;
import java.util.Scanner;

public class EighthTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type your String to get count of vowels and consonant of current String: ");
        String s = in.nextLine();
        s = s.toLowerCase();
        char[] c = s.toCharArray();
        int i = c.length;
        System.out.println(removeDuplicateCharacters(c, i));
    }

    public static String removeDuplicateCharacters(char[] word, int length) {
        int i = 0;
        int j;

        for (int t = 0; t < length; t++) {
            for (j = 0; j < t; j++) {
                if (word[t] == word[j]) {

                }
            }

        }
        return null;
    }
}

