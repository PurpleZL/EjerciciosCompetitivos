package AceptaElReto;

/*
3
10 8 7
3
8 8 8
0

5
0
 */

public class AceptaElReto589 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        long copas;
        long totalBebida;
        do {
            copas = sc.nextInt();
            if (copas != 0) {
                totalBebida = 0;
                long max = Long.MIN_VALUE;

                for (long i = 0; i < copas; i++) {
                    long c = sc.nextLong();
                    totalBebida += c;
                    if (max<=c) {
                        max=c;
                    }
                }
                System.out.println((max*copas)-totalBebida);
            }
        } while (copas != 0);
    }
}