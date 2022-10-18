import java.util.Scanner;

public class EighthTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Checking if there is letter d in current String: ");
        String s = in.nextLine();
        s = s.toLowerCase();
        boolean b = checkIfThereIsTheLetterD(s);

        if(b){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
    public static boolean checkIfThereIsTheLetterD(String s){
            for (int i = 0; i < s.length(); i++){
                if (s.charAt(i) == 'd'){
                    return true;
                }
            }
            return false;
    }
}
