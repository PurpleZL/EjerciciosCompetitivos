package AceptaElReto;

/*
4
1 2 3 4
5
10 1 2 3 4
4
1 1 2 2
0

DALTON
DESCONOCIDOS
DESCONOCIDOS
 */
import java.util.Scanner;

public class AceptaElReto245 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            n = sc.nextInt();
            if (n != 0) {
                if (esDalton(n)) {
                    System.out.println("DALTON");
                } else {
                    System.out.println("DESCONOCIDOS");
                }
            }
        } while (n != 0);
    }

    private static boolean esDalton(int n) {
        long prev = sc.nextLong(); 
        long actual;
        boolean creciente = true;
        boolean decreciente = true;

        for (int i = 1; i < n; i++) {
            actual = sc.nextLong();
            if (actual <= prev) {
                creciente = false;
            }
            if (actual >= prev) {
                decreciente = false;
            }
            prev = actual;
        }

        return creciente || decreciente;
    }
}