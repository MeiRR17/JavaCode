import java.util.ArrayList;
import java.util.HashMap;

public class SeventhTask {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 1);
        map.put('d', 3);

        System.out.println(removeDuplicateValue(map));

    }
    public static HashMap<Character, Integer> removeDuplicateValue(HashMap<Character, Integer> map){

        for (Character c : map.keySet()) {
            if (map.containsValue(c)) {
                map.remove(c);
            }
        }
        return map;
    }
}
