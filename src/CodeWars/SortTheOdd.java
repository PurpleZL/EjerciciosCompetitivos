package CodeWars;

import java.util.Arrays;

public class SortTheOdd {
    public static int[] sortArray(int[] array) {
        int[] oddNumbers = Arrays.stream(array).filter(num -> num % 2 != 0).toArray();
        Arrays.sort(oddNumbers);
        int oddIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = oddNumbers[oddIndex++];
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = sortArray(new int[]{ 5, 3, 1, 8, 0 });
        for (int i : arr) {
            System.out.print(i+",");
        }
    }
}
