import java.util.Arrays;

public class UsingTemporaryIntegerAndWhileLoop {
    public static void main(String[] args) {
        int[] integerArr = {1, 2, 3, 4};
        int[] reversedArr = reverseArrayUsingTempIntAndWhileLoop(integerArr);

        System.out.println("Reversed array: " + Arrays.toString(reversedArr) + ".");
    }
    static int[] reverseArrayUsingTempIntAndWhileLoop(int[] integerArr){
        int firstIndex = 0;
        int lastIndex = integerArr.length-1;

        //while last int(last integer in array) is greater than first int(0)
        //When the loop reaches the middle of the array then the loop will stop

        while(lastIndex > firstIndex){

            //using multiply swapping method using with temporary int

            int temporary = integerArr[firstIndex];
            integerArr[firstIndex] = integerArr[lastIndex];
            integerArr[lastIndex] = temporary;

            firstIndex += 1;
            lastIndex -= 1;
        }
        return integerArr;
    }
}
