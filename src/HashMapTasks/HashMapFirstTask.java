package src.HashMapTasks;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapFirstTask {
    public static void main(String[] args) {
        System.out.println(mergedTwoArrayListToHashMap());
    }
    public static HashMap<String, Integer> mergedTwoArrayListToHashMap(){
        ArrayList<String> firstOne = new ArrayList<>();
        firstOne.add("one");
        firstOne.add("two");
        firstOne.add("three");

        ArrayList<Integer> secondOne = new ArrayList<>();
        secondOne.add(1);
        secondOne.add(2);
        secondOne.add(3);

        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0;i<firstOne.size();i++) {
            map.put(firstOne.get(i), secondOne.get(i));
        }
        return map;
    }
}
