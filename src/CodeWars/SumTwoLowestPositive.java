package CodeWars;

import java.util.Arrays;

public class SumTwoLowestPositive {
    public static long sumTwoSmallestNumbers(long[] numbers) {
        Arrays.sort(numbers);
        return numbers[0] + numbers[1];
        //return Arrays.stream(numbers).sorted().limit(2).sum();
    }
}
