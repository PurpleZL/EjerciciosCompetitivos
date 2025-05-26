package CodeWars;

/*
Given an n x n array.
array = [[1,2,3],
         [4,5,6],
         [7,8,9]]
snail(array) #=> [1,2,3,6,9,8,7,4,5]
NOTE 2: The 0x0 (empty matrix) is represented as en empty array inside an 
array [[]]
 */
public class Snail {

    public static void main(String[] args) {
        int[][] array2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[] array = snail(array2D);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public static int[] snail(int[][] array2D) {
        if (array2D.length == 0 || (array2D.length > 0 && array2D[0].length == 0)) {
            return new int[0];
        }
        int sizeT = array2D.length * array2D[0].length;
        int[] array = new int[sizeT];
        int position = 0;
        int top = 0, bottom = array2D.length - 1, left = 0, right = array2D[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                array[position++] = array2D[top][i];
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                array[position++] = array2D[i][right];
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    array[position++] = array2D[bottom][i];
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    array[position++] = array2D[i][left];
                }
                left++;
            }
        }
        return array;
    }
}
