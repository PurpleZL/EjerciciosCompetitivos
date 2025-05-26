package AceptaElReto;

/*
3 500 500 -300
5 100 -100 50 -20 50
0

700 1000
80 100
 */
public class AceptaElReto424 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                return;
            }

            long num, max = 0, res = 0;

            while (n-- > 0) {
                num = sc.nextLong();
                res += num;
                if (res > max) {
                    max = res;
                }
            }

            System.out.println(res + " " + max);
        }
    }
}
