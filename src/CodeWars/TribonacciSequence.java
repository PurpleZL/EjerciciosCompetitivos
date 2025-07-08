package CodeWars;

import java.util.Arrays;

public class TribonacciSequence {
    public double[] tribonacci(double[] s, int n) {
        if (n == 0) return new double[0];
        double[] r = new double[n];
        if (n <= 3){
            for (int i = 0; i < n; i++) {
                r[i] = s[i];
            }
            return r;
        }
        r[0] = s[0];
        r[1] = s[1];
        r[2] = s[2];
        for (int i = 3; i < n; i++) {
            r[i] = r[i-1]+r[i-2]+r[i-3];
        }
        return r;
    }
}
