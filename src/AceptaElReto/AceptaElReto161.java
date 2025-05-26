package AceptaElReto;

import java.util.Arrays;

/*
11
1 2 6 17 18 22 35 46 109 153 200
5
5 3 1 2 8
4
4 5 9 2
0

44
6
9
 */
public class AceptaElReto161 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos;
        int[] lista;
        double mediana;

        do {
            casos = sc.nextInt();
            if (casos != 0) {
                lista = new int[casos];
                for (int i = 0; i < casos; i++) {
                    lista[i] = sc.nextInt();
                }
                Arrays.sort(lista);
                if (casos % 2 == 0) {
                    mediana = (lista[casos / 2 - 1] + lista[casos / 2]) / 2.0;
                } else {
                    mediana = lista[casos / 2];
                }

                System.out.println((int) (mediana * 2));
            }
        } while (casos != 0);
    }
}
