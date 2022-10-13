import java.util.ArrayList;
import java.util.HashMap;

public class FourthTask {
    public static void main(String[] args) {
        boolean result = checkIfValuesSame();
        if (result) {
            System.out.println("All the values in HashMap are same.");
        } else {
            System.out.println("Not all the values in HashMap are same.");

        }
    }

    public static boolean checkIfValuesSame() {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 1);
        map.put("C", 1);
        map.put("D", 1);

        int firstValue = new ArrayList<>(map.values()).get(0);

        for (int value : map.values()) {
            if (value != firstValue) {
                return false;
            }
        }
        return true;
    }
}