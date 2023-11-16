package Map_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountSameSymbols {
    public static Map<Character, Integer> getChars(String s) {
        Map<Character, Integer> charsMap = new HashMap<>(s.length());
        for (int i = 0; i < s.length(); ++i) {
            if (charsMap.containsKey(s.charAt(i))) {
                int count = charsMap.get(s.charAt(i));
                charsMap.put(s.charAt(i), ++count);
            } else {
                charsMap.put(s.charAt(i), 1);
            }
        }
        return charsMap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String newLine = scanner.nextLine();
        System.out.println(getChars(newLine));
    }
}
