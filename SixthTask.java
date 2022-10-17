import java.util.HashMap;
import java.util.Scanner;

public class SixthTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type your String to get count of vowels and consonant of current String: ");
        String s = in.nextLine();
        s = s.toLowerCase();

        HashMap <Character, Integer> vowelsMap = new HashMap<>();
        HashMap <Character, Integer> consonantsMap = new HashMap<>();

        vowelsMap.put('a', 0);
        vowelsMap.put('e', 0);
        vowelsMap.put('i', 0);
        vowelsMap.put('o', 0);
        vowelsMap.put('u', 0);

        consonantsMap.put('z', 0);
        consonantsMap.put('b', 0);
        consonantsMap.put('t', 0);
        consonantsMap.put('g', 0);
        consonantsMap.put('h', 0);

        HashMap<Character, Integer> countVowels = countVowels(vowelsMap, s);
        HashMap<Character, Integer> countConsonants = countConsonants(consonantsMap, s);

        System.out.println("Count of vowels in current String: " + countVowels + ".");
        System.out.println("Count of consonants in current String: " + countConsonants + ".");
    }

    public static HashMap<Character, Integer> countVowels(HashMap<Character, Integer> map, String s) {
        int count;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                count = map.get(s.charAt(i)) + 1;
                map.put(s.charAt(i), ++count);
            }
        }
        return map;
    }

    public static HashMap<Character, Integer> countConsonants(HashMap<Character, Integer> map, String s) {
        int count;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                count = map.get(s.charAt(i)) + 1;
                map.put(s.charAt(i), count);
            }
        }
        return map;
    }
}
