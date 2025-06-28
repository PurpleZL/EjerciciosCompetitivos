package CodeWars;

import java.util.Arrays;
import java.util.Comparator;

public class ShortestWord {
    public static int findShort(String s) {
        return Arrays.stream(s.split(" "))
                .sorted(Comparator.comparingInt(String::length))
                .findFirst()
                .get()
                .length();
    }

    public static void main(String[] args) {
        System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
    }
}
