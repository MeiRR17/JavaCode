import java.util.HashSet;
import java.util.Scanner;

public class NinethTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type your String to get it without duplicate chars: ");
        String s = in.nextLine();
        s = s.toLowerCase();
        HashSet<Character> set = new HashSet<>();
        HashSet<Character> mainSet = removeDuplicateChars(set, s);
        System.out.println("The String without duplicate characters: ");
        for(Character c : mainSet) {
            System.out.print(c);
        }
        System.out.print(".");
    }
    public static HashSet<Character> removeDuplicateChars(HashSet<Character> set, String s){
        for(int i=0;i<s.length();i++)
            set.add(s.charAt(i));
        return set;
    }
}
