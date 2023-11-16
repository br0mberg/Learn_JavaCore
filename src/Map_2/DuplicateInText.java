package Map_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// import com.google.common.base;

public class DuplicateInText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String charsToRemove = ",_!?.";
        // text = CharMatcher.anyOf(charsToRemove).removeFrom(text);

        Map<String, Integer> duplicateCounterMap = new HashMap<>();

        for(String key : text.split(" ")) {
            key = key.toLowerCase();
            if (duplicateCounterMap.containsKey(key)) {
                int count = duplicateCounterMap.get(key);
                duplicateCounterMap.put(key, ++count);
            } else {
                duplicateCounterMap.put(key, 0);
            }
        }

        System.out.println(duplicateCounterMap);
    }
}
