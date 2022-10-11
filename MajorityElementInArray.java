public class MajorityElementInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 5, 2, 5, 5, 5, 0, 3, 3};
        //if method turned nothing then there is no frequent else there is frequent
        int frequentNum = findFrequentNum(arr);
        System.out.println("The answer is: " + frequentNum + ". Because this number is " + findCountOfFrequentNum(arr, frequentNum) + " times inside the array.");
    }
    public static int findFrequentNum(int[] arr) {
        int count;
        int max = 0;
        int currentMax = 0;
        //Nested for loop
        for (int j : arr) {
            count = 0;
            for (int i : arr) {
                //if they equal then count will increase by 1
                if (j == i) {
                    count++;
                }
            }
            //if max is lower than count then max is now count
            if (max < count) {
                max = count;
                //saved the current max number in currentMax
                currentMax = j;
            }
        }

        //returned the final max number
        return currentMax;
    }
    public static int findCountOfFrequentNum(int[] arrI, int ele) {
        //found count of the frequent number using nested for loop
        int count = 0;
        for (int j : arrI) {
            if (j == ele) {
                count++;
            }
        }
            return count;
    }
}