public class OverloadMethodTask {
    public static void main(String[] args) {
        //saved in main.
        int multiplyTwoInts = multiplyNumbers(1, 2);
        double multiplyTwoDoubles = multiplyNumbers(3.14, 2.1);
        double multiplyThreeFloats = multiplyNumbers(1.1f, 4.1f, 2.2f);
        double multiplyTwoIntsAndOneDouble = multiplyNumbers(1, 2, 3.22);
        //printed the result.
        System.out.println("multiplication of 2 current ints is: " + multiplyTwoInts + ".");
        System.out.println("multiplication of 2 current doubles is: " + multiplyTwoDoubles + ".");
        System.out.println("multiplication of 3 current floats is: " + multiplyThreeFloats + ".");
        System.out.println("multiplication of 2 current ints and one double is: " + multiplyTwoIntsAndOneDouble + ".");
    }
    //multiplication of 2 ints.
    public static int multiplyNumbers (int x, int y){
        return x*y;
    }
    //multiplication of 2 doubles.
    public static double multiplyNumbers (double x, double y){
        return x*y;
    }
    //multiplication of 3 floats.
    public static double multiplyNumbers (float x, float y, float z){
        return x*y*z;
    }
    //multiplication of 2 ints and one double.
    public static double multiplyNumbers (int x, int y, double z){
        return x*y*z;
    }
}