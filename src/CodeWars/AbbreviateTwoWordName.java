package CodeWars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AbbreviateTwoWordName {
    public static String abbrevName(String name) {
        return Arrays.stream(name.toUpperCase().split(" "))
                .map(w -> String.valueOf(w.charAt(0)))
                .collect(Collectors.joining("."));
    }
}
