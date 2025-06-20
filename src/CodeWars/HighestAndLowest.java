package CodeWars;

import java.util.Arrays;

/*

 */
public class HighestAndLowest {
    public static void main(String[] args) {
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
    public static String highAndLow(String numbers) {
        int[] nums = Arrays.stream(numbers.split(" "))
                .mapToInt(n -> Integer.parseInt(n))
                .sorted().toArray();
        return nums[nums.length-1]+ " " + nums[0];
    }
}
