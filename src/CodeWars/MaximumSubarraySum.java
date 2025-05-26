package CodeWars;

/*
Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
should be 6: {4, -1, 2, 1}
 */
public class MaximumSubarraySum {

    public static void main(String[] args) {
        System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    public static int sequence(int[] array) {
        int sum = 0;
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
}
