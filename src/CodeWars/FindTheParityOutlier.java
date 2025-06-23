package CodeWars;


public class FindTheParityOutlier {
    public static void main(String[] args) {
        System.out.println(find(new int[] {2, 6, 8, -10, 3}));
    }
    static int find(int[] integers) {
        int lastEven = 0;
        int lastOdd = 0;
        int evenCount = 0;
        int oddCount = 0;

        for (int num : integers) {
            if (num % 2 == 0) {
                evenCount++;
                lastEven = num;
            } else {
                oddCount++;
                lastOdd = num;
            }
        }
        return (evenCount > oddCount)? lastOdd:lastEven;
    }
}
