import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type your String to get count of vowels and consonant of current String: ");
        String s = in.nextLine();
        int numOfVowels = countVowels(s);
        int numOfConsonants = countConsonants(s);
        System.out.println("Count of vowels in current String: " + numOfVowels + ".");
        System.out.println("Count of consonants in current String: " + numOfConsonants + ".");
    }
    public static int countVowels(String s) {
        int count = 0;
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'u' || s.charAt(i) == 'i' || s.charAt(i) == 'o') {
                count++;
            }
        }
        return count;
    }
    public static int countConsonants(String s){
        int count = 0;
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'z' || s.charAt(i) == 'b' || s.charAt(i) == 't' || s.charAt(i) == 'g' || s.charAt(i) == 'h') {
                count++;
            }
        }
        return count;
    }
}