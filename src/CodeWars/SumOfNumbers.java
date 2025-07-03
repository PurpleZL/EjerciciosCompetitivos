package CodeWars;

public class SumOfNumbers {
    public int GetSum(int a, int b) {
        if (a == b) return a;
        int max = (a>b)? a:b;
        int min = (a>b)? b:a;
        int tot = 0;
        for (int i = min; i <= max; i++) {
            tot += i;
        }
        return tot;
    }
}
