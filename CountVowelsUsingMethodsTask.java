import java.util.Scanner;

public class CountVowelsUsingMethodsTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String s = in.nextLine();
        int result = countNumVowels(s);
        System.out.println("The number of vowels in your current word is " + result + ".");
    }
    public static int countNumVowels(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char vowel = s.charAt(i);
                if (vowel == 'e' || vowel == 'o' || vowel == 'u' || vowel == 'i' || vowel == 'a'
                    || vowel == 'E' || vowel == 'O' || vowel == 'U' || vowel == 'I' || vowel == 'A'){
                count++;
            }
        }
        return count;
    }
}