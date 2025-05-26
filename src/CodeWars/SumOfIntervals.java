package CodeWars;

/*
sumIntervals( [
   [0, 20],
   [-100000000, 10],
   [30, 40]
] ) => 100000030
 */
public class SumOfIntervals {
    public static int sumIntervals(int[][] intervals) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int length=0;
        for (int[] interval : intervals) {
            if (interval[0] <= min && interval[1] >= max) {
                min = interval[0];
                max = interval[1];
                length=max-min;
            } else if (interval[0] <= min && interval[1] < max) {
                length+=interval[1]-interval[0];
            } else if (interval[0] > min && interval[1] >= max) {
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[][] array={{0,20},{-100000000,10},{30,40}};
        System.out.println(sumIntervals(array));
    }
}
