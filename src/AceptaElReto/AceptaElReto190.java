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
public class AceptaElReto190 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        long num = -1;
        long den = -1;
        do {
            num = sc.nextLong();
            den = sc.nextLong();
            if (num >= den) {
                System.out.println(factorial(num)/factorial(den));
            }
        } while (num >= den);
    }

    private static long factorial(long num) {
        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
