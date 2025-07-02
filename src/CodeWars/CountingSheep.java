package CodeWars;

import java.util.Arrays;

public class CountingSheep {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        return (int) Arrays.stream(arrayOfSheeps).filter(b -> (b!=null && b)).count();
    }
}
