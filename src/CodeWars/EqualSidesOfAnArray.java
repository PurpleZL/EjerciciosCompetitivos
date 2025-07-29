package CodeWars;

public class EqualSidesOfAnArray {
    public static int findEvenIndex(int[] arr) {
        int tot = 0;
        if (arr.length == 1) return 0;

        for (int i : arr) {
            tot += i;
        }

        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < arr.length; i++) {
            sumRight = tot - sumLeft - arr[i];
            if (sumLeft == sumRight) {
                return i;
            }
            sumLeft += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findEvenIndex(new int[] {1,100,50,-51,1,1}));
    }
}
