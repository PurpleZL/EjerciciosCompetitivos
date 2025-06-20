package CodeWars;

import java.util.Arrays;

/**
 *
 * @author vladu
 */
public class BitCounting {

    public static void main(String[] args) {
        System.out.println(countBits(1234));
    }

    public static int countBits(int n) {
        return (int) Arrays.stream(Integer.toBinaryString(n).split(""))
                .filter(b -> b.equals("1")).count();
    }
}
