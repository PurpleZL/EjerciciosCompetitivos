package AceptaElReto;

/*
1 1
5 1
0 0

h1
d1
 */
public class AceptaElReto481 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int fila;
        int columna;
        do {
            fila = sc.nextInt();
            columna = sc.nextInt();
            if (fila != 0 && columna != 0) {
                System.out.println((char) ('h' + 1 - fila) + "" + columna);
            }
        } while (fila != 0 && columna != 0);
    }
}
