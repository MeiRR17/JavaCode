import java.util.HashSet;
import java.util.Scanner;

public class FindIfAllCharactersAreUnique {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your word/sentence: ");
        String finalS = in.nextLine();

        if (FindIfAllAreUniqueCharacters(finalS)) {
            System.out.print("In your current word/sentence (" + finalS + "), all the characters are unique.");
        } else {
            System.out.print("In your current word/sentence (" + finalS + "), there iis one or more characters that are not unique.");
        }
    }

    static boolean FindIfAllAreUniqueCharacters(String s) {
        HashSet<Character> charHS = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            charHS.add(s.charAt(i));
        }
        return s.length() == charHS.size();
    }
}