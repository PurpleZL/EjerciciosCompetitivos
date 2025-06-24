package CodeWars;

import java.util.Arrays;

public class SquareSum {
    public static void main(String[] args) {
        System.out.println(squareSum(new int[] {5,-3,4}));
    }

    public static int squareSum(int[] n) {
        return Arrays.stream(n).map(i -> i*i).sum();
    }
}
