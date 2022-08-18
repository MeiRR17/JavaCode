
public class ReverseAnArrayUsingMethodsTask {
    public static void main(String[] args) {
        System.out.print("Reversed current array is: ");
            int [] arr = {1, 2, 3, 4, 5};
            for(int i=arr.length-1;i>=0;i--) {
                System.out.print(arr[i] + ", ");
            }
        System.out.println(".");
    }
}