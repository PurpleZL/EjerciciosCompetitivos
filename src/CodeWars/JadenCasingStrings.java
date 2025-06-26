package CodeWars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCasingStrings {
    public static void main(String[] args) {
        System.out.println(toJadenCase("most trees are blue"));
    }
    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) return null;
        return Arrays.stream(phrase.split(" "))
                .map(p -> p = Character.toUpperCase(p.charAt(0)) + p.substring(1, p.length()))
                .collect(Collectors.joining(" "));
    }
}
