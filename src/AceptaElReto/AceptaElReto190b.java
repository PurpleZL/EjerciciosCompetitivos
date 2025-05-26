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
public class AceptaElReto190b {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int num = -1;
        int den = -1;
        long facN = 1;
        long facD = 1;
        do {
            num = sc.nextInt();
            den = sc.nextInt();
            if (num >= den) {
                for (int i = 1; i <= num; i++) {
                    facN *= i;
                }
                for (int i = 1; i <= den; i++) {
                    facD *= i;
                }
                System.out.println(facN / facD);
            }
        } while (num >= den);
    }
}
