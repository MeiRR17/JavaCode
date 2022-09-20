import java.util.HashMap;
import java.util.Scanner;

import static java.lang.System.out;

public class CheckIfAllCharUniqueUsingHashMAp {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        out.println("Type your word/sentence and press the Enter key: ");
        String s = in.nextLine();
        out.print("Down here you will see how many times every letter ");
        out.println("in your current word has been used to make your word/sentence: ");
        boolean bFinal = countLetters(s);
            if(bFinal) {
                out.println("Not all characters are unique.");
            }else{
                out.println("All characters are unique.");
            }
    }
    public static boolean countLetters(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arrC = s.toCharArray();
        for (char c : arrC) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (Character ch : map.keySet()) {
            return map.get(ch) > 1;
        }
        return false;
    }
}