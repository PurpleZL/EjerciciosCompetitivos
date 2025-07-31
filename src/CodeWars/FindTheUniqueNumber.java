package CodeWars;

import java.util.Arrays;

public class FindTheUniqueNumber {
    public static double findUniq(double arr[]) {
        double[] temp = Arrays.stream(arr).distinct().toArray();
        return(Arrays.stream(arr).filter(c -> c == temp[0]).count() > 1)? temp[1]:temp[0];
    }
}
