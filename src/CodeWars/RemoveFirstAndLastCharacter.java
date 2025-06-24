package CodeWars;

import java.util.*;
import java.util.stream.Collectors;


public class RemoveFirstAndLastCharacter {
    public static void main(String[] args) {
        System.out.println(remove("eloquent"));
    }
    public static String remove(String str) {
        return str.chars()
                .skip(1)
                .limit(str.length() - 2)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }
}
