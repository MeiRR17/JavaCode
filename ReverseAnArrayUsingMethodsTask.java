
public class ReverseAnArrayUsingMethodsTask {
    public static void main(String[] args) {
        System.out.print("Reversed current array is: ");
            int [] arr = {1, 2, 3, 4, 5};
        for(int i = 0; i < arr.length / 2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

}