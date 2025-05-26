package AceptaElReto;

/*
20 4 4
17 5 4
10 35 15
1 2 3
0 0 0

7
26
12
6
 */
public class AceptaElReto541 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int is, vs, xs;
        do {
            is = sc.nextInt();
            vs = sc.nextInt();
            xs = sc.nextInt();
            
            if (is == 0 && vs == 0 && xs == 0) {
                break;
            }
            
            int mcd = mcd3(is, vs, xs);
            int tamanoMolde = (is + vs + xs) / mcd;
            System.out.println(tamanoMolde);
        } while (true);
    }

    private static int mcd3(int a, int b, int c) {
        return mcd(mcd(a, b), c);
    }

    private static int mcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}