package CodeWars;

import java.util.List;

public class CountTheSmileyFaces {
    public static int countSmileys(List<String> arr) {
        return (int) arr.stream().filter(c -> {
            int len = c.length();
            if (len != 2 && len != 3) return false;
            if (c.charAt(0) != ':' && c.charAt(0) != ';') return false;
            if (len == 2) {
                return c.charAt(1) == ')' || c.charAt(1) == 'D';
            } else {
                return (c.charAt(1) == '-' || c.charAt(1) == '~') &&
                        (c.charAt(2) == ')' || c.charAt(2) == 'D');
            }
        }).count();
    }
}
