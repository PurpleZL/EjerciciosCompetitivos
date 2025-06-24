package CodeWars;

import java.util.Arrays;

public class ExesAndOhs {
    public static void main(String[] args) {
        System.out.println(getXO("xxxooo"));
    }
    public static boolean getXO (String str) {
        return Arrays.stream(str.toLowerCase().split("")).filter(n -> n.equals("o")).count()
                ==
                Arrays.stream(str.toLowerCase().split("")).filter(n -> n.equals("x")).count();
    }
}
