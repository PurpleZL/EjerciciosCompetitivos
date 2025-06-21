package CodeWars;

import java.util.Arrays;

public class SumOfPositive {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{1,-2,3,4,5}));
    }

    public static int sum(int[] arr) {
        int[] suma = {0};
        Arrays.stream(arr).filter(n -> (n > 0)).forEach(n -> suma[0]+=n);
        return suma[0];
    }
}
