package AceptaElReto;

/*
5 2
6 5
8 3
17 8
1 2

60
6
6720
8821612800
 */
public class AceptaElReto190c {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        long num = -1;
        long den = -1;
        do {
            num = sc.nextLong();
            den = sc.nextLong();
            if (num >= den) {
                System.out.println(divideFactoriales(num, den));
            }
        } while (num >= den);
    }

    private static long divideFactoriales(long num, long den) {
        long result = 1;
        for (long i = num; i > den; i--) {
            result *= i;
        }
        return result;
    }
}
