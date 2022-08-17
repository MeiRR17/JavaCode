import java.util.Arrays;

public class SortedArrayUsingMethodsTask {
    public static void main(String[] args) {
        System.out.print("Array returned from method that is sorted: ");
        for(int i = 0;i<sortedArray().length;i++){
            System.out.print(sortedArray()[i] + ",");
        }
        System.out.println(".");
    }
    public static int [] sortedArray(){
        int [] arr = {1, 4, 2, 3};
        Arrays.sort(arr);
        return arr;
    }
}
