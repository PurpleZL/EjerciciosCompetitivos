package CodeWars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TwoToOne {
    public static String longest (String s1, String s2) {
        return Arrays.stream((s1 + s2).split(""))
                .distinct()
                .sorted()
                .collect(Collectors.joining());
    }
}
