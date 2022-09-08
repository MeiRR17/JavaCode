import java.util.HashSet;
import java.util.Scanner;

public class HashSetLearningTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String s = in.nextLine();
        int output = uniqueElement(s);

        System.out.println("The count of unique elements in your current word is: " + output + ".");
    }

    public static int uniqueElement(String s) {
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            hs.add(s.charAt(i));
        }
        int size = hs.size();

        return size;
    }
}