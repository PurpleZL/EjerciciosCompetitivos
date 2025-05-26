package AceptaElReto;

/*
5 3000 3500 3200 3400 3200
4 4000 3500 3500 3200
0

3
3
 */
public class AceptaElReto171Nogal {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n, c, altMax;
        int[] montes;
        do {
            n = sc.nextInt();
            if (n != 0) {
                c = 0;
                altMax = -1;
                montes = new int[n];
                for (int i = 0; i < n; i++) {
                    montes[i] = sc.nextInt();
                }
                for (int i = n-1; i >= 0; i--) {
                    if (montes[i] > altMax) {
                        altMax = montes[i];
                        c++;
                    }
                }
                System.out.println(c);
            }
        } while (n != 0);
    }
}
