import java.util.Scanner;

public class anagramUsingTemp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first String: ");
        String first = in.nextLine().toLowerCase();
        System.out.println("Enter the second String: ");
        String second = in.nextLine().toLowerCase();
        if(checkIfStringHaveSameLetters(first, second)){
            System.out.println("Both Strings are anagrams.");
        }else{
            System.out.println("Current Strings are not anagrams.");
        }
    }
    static String sortString(String s){
        char []letters = s.toCharArray();
        for(int i = 0;i<s.length();i++){
            for(int j = i+1;j<s.length();j++){
                char temp;
                if(letters[i] > letters[j]) {
                    temp = letters[i];
                    letters[i] = letters[j];
                    letters[j] = temp;
                }
            }
        }
        return String.valueOf(letters);
    }
    static boolean checkIfStringHaveSameLetters(String firstString, String secondString){
        return sortString(firstString).equals(sortString(secondString));
    }
}
