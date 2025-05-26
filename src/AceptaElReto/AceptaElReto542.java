package AceptaElReto;

import java.util.Arrays;

/*
3
1 1 1 2 2 2
1 2 1 2 2 2
4 5 3 20 10 6

SIRVE
NO SIRVE
SIRVE
*/
public class AceptaElReto542 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            int[] juguete = new int[3];
            int[] carton = new int[3];
            juguete[0] = sc.nextInt();
            juguete[1] = sc.nextInt();
            juguete[2] = sc.nextInt();
            carton[0] = sc.nextInt();
            carton[1] = sc.nextInt();
            carton[2] = sc.nextInt();
            Arrays.sort(juguete);
            Arrays.sort(carton);
            if (juguete[0] < carton[0] && 
                juguete[1] < carton[1] && 
                juguete[2] < carton[2]) {
                System.out.println("SIRVE");
            } else {
                System.out.println("NO SIRVE");
            }
        }
    }
}
