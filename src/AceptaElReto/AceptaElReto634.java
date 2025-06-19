package AceptaElReto;

/*
4
O.O.
OO...
OO.OO..
.OOOO...

20
30
60
100
 */
public class AceptaElReto634 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        int casos = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < casos; i++) {
            char[] combo = sc.nextLine().toCharArray();
            int puntuacion = 0;
            int puntos = 10;
            for (char c : combo) {
                if (c == 'O') {
                    puntuacion += puntos;
                    puntos += 10;
                }else puntos = 10;
            }
            System.out.println(puntuacion);
        }
    }
}
