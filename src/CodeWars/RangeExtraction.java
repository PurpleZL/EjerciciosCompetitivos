package CodeWars;

/*
Solution.rangeExtraction(new int[] {-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20})
# returns "-10--8,-6,-3-1,3-5,7-11,14,15,17-20"
It is not considered a range unless it spans at least 3 numbers.
 */
public class RangeExtraction {

    public static void main(String[] args) {
        System.out.println(rangeExtraction(new int[]{-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20}));
    }

    public static String rangeExtraction(int[] arr) {
        String range = "";
        int[] lastDigit;
        for (int i = 0; i < arr.length; i++) {
            if (i + 2 < arr.length && arr[i] + 1 == arr[i + 1] && arr[i] + 2 == arr[i + 2]) {
                lastDigit = lastRange(i, arr);
                range += arr[i] + "-" + lastDigit[0];
                i = lastDigit[1];
            } else {
                range += arr[i];
            }
            if (i < arr.length - 1) {
                range += ",";
            }
        }
        return range;
    }

    public static int[] lastRange(int initial, int[] array) {
        int[] range = new int[2];
        for (int i = initial; i < array.length; i++) {
            if (i + 1 < array.length && array[i] + 1 == array[i + 1]) {
                range[0] = array[i + 1]; 
                range[1] = i + 1;       
            } else {
                break; 
            }
        }
        return range;
    }
}