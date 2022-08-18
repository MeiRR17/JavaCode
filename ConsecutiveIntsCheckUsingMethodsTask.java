import java.util.Scanner;

public class ConsecutiveIntsCheckUsingMethodsTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = in.nextInt();
        System.out.println("Enter the second number: ");
        int b = in.nextInt();
        System.out.println("Enter the third number: ");
        int c = in.nextInt();

        boolean sFinal = checkConsecutive(a, b, c);
        if(sFinal) {
            System.out.println("The integers are consecutive.");
        }else{
            System.out.println("The integers are not consecutive");
        }
    }
    public static boolean checkConsecutive(int one, int two, int three){
        return one == two - 1 && one == three - 2;
    }
}