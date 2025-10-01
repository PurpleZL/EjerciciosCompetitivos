package CodeWars;
import java.util.*;

public class PowerSumDig {
    public static void main(String[] args) {
        System.out.println(powerSumDigTerm(4));
    }

    public static long powerSumDigTerm(int n) {
        Set<Long> results = new HashSet<>();

        for (int base = 2; base <= 500; base++) {
            long value = base * base; // base^2

            while (value > 0 && value < Long.MAX_VALUE / base) {
                if (sumDigits(value) == base) {
                    results.add(value);
                }
                value *= base;
            }
        }

        List<Long> sorted = new ArrayList<>(results);
        Collections.sort(sorted);

        return sorted.get(n - 1);
    }

    private static long sumDigits(long n) {
        long sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
