import java.util.Scanner;

public class EighthTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Checking if there is letter d in current String: ");
        String s = in.nextLine();
        s = s.toLowerCase();

        String output = outputNewString(s);

        System.out.println(output);
    }
    public static boolean checkIfThereIsLetter(String s, char ch){
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ch){
                return true;
            }
        }
        return false;
    }
    public static String outputNewString(String s){
        String newS = "";
        char ch;

        for(int i = 0;i<s.length();i++){
            ch = s.charAt(i);
            boolean b = checkIfThereIsLetter(s, ch);
            if(!b){
                newS = newS + ch;
            }
        }
        return newS;
    }
}
