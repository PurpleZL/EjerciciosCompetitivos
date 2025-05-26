package CodeWars;

/*
Given an array of integers, find the one that appears an odd number of times.

There will always be only one integer that appears an odd number of times.
Examples

[7] should return 7, because it occurs 1 time (which is odd).
[0] should return 0, because it occurs 1 time (which is odd).
[1,1,2] should return 2, because it occurs 1 time (which is odd).
[0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
[1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).

 */
public class FindTheOddInt {

    public static void main(String[] args) {
        int[] test = {20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5};
        System.out.println(findOdd(test));
    }

    public static int findOdd(int[] array) {
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            counter = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter++;
                }
            }
            if (counter % 2 == 1) {
                return array[i];
            }
        }
        return 0;
    }
}
