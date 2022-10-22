import java.util.Arrays;

public class UsingTemporaryIntegerAndForLoop {
    public static void main(String[] args) {
        int[] integerArr = {1, 2, 3, 4};
        int[] reversedArr = reverseArrayUsingTempIntAndForLoop(integerArr);

        System.out.println("Reversed array: " + Arrays.toString(reversedArr) + ".");
    }
    static int[] reverseArrayUsingTempIntAndForLoop(int[] integerArr){


        int lastIndex = integerArr.length - 1;

        //When the loop reaches the middle of the array then the loop will stop

        for (int firstIndex = 0;firstIndex < integerArr.length/2; firstIndex++, lastIndex--/*it is possible also to delete lastIndex-- and cover it later.*/){
            int temporary = integerArr[firstIndex];
            integerArr[firstIndex] = integerArr[lastIndex];
            integerArr[lastIndex] = temporary;
        }
        return integerArr;
    }
}
