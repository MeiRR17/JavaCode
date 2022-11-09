package src;

public class SumOfThreeIntsUsingMethodsTask {

    public static void main(String[] args) {
        int s = sum(1, 2, 3);
        System.out.println(s);
    }
    static int sum(int a, int b, int c) {
        return a + b + c;
    }
}