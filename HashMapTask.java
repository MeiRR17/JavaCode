import java.util.HashMap;
import java.util.Scanner;

import static java.lang.System.out;

public class HashMapTask {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        mainIntro();
        String s = in.nextLine();
        outputIntro();
        countLetters(s);

    }
    public static HashMap<Character, Integer> countLetters(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arrC = s.toCharArray();
        for (char c : arrC) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }
    public static void outputIntro() {
        out.print("Down here you will see how many times every letter ");
        out.println("in your current word has been used to make your word/sentence: ");
    }
    public static void mainIntro(){
        out.println("Type your word/sentence and press the Enter key: ");
    }
}