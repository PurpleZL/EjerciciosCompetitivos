package CodeWars;

import java.util.Arrays;
import java.util.Comparator;

public class YourOrderPlease {
    public static String order(String words) {
        if (words.isBlank()) return "";
        String[] wordArray = words.split(" ");
        Arrays.sort(wordArray, Comparator.comparingInt(word -> {
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (Character.isDigit(c)) {
                    return Character.getNumericValue(c);
                }
            }
            return 0;
        }));
        return String.join(" ", wordArray);
    }
}
