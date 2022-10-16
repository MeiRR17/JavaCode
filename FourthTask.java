import java.util.ArrayList;
import java.util.HashMap;

public class FourthTask {
    public static void main(String[] args) {
        int firstValue = checkIfValuesSame();
        HashMap<String, Integer> mainMap = new HashMap<>();

        mainMap.put("A", 1);
        mainMap.put("B", 1);
        mainMap.put("C", 1);
        mainMap.put("D", 1);
        for (int value : mainMap.values()) {
            if (value != firstValue) {
                System.out.println("All the values in HashMap are same.");            }
        }
        System.out.println("Not all the values in HashMap are same.");

    }

    public static int checkIfValuesSame() {

        HashMap<String, Integer> map = new HashMap<>();


        return new ArrayList<>(map.values()).get(0);

    }
}