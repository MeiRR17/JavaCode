import java.util.ArrayList;
import java.util.HashMap;

public class FirstTask {
    public static void main(String[] args) {
        System.out.println(mergedTwoArrayListToHashMap());
    }
    public static HashMap<ArrayList<String>, ArrayList<Integer>> mergedTwoArrayListToHashMap(){
        ArrayList<String> firstOne = new ArrayList<>();
        firstOne.add("one");
        firstOne.add("two");
        firstOne.add("three");

        ArrayList<Integer> secondOne = new ArrayList<>();
        secondOne.add(1);
        secondOne.add(2);
        secondOne.add(3);

        HashMap<ArrayList<String>, ArrayList<Integer>> map = new HashMap<>();

        map.put(firstOne, secondOne);

        return map;
    }
}
