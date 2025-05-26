package CodeWars;

/*
For example: [1,2,3,4,5] for 2 beggars will return a result of [9,6], 
as the first one takes [1,3,5], the second collects [2,4].

The same array with 3 beggars would have in turn have produced a better 
out come for the second beggar: [5,7,3], as they will respectively take 
[1,4], [2,5] and [3].
 */
public class EnglishBeggars {

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5};
        int[] t = beggars(test, 2);
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
    }

    public static int[] beggars(int[] values, int n) {
        if (n == 0) {
            return new int[0];
        }
        int[] sums = new int[n];
        for (int i = 0; i < values.length; i++) {
            int beggarIndex = i % n;
            sums[beggarIndex] += values[i];
        }

        return sums;
    }
}
