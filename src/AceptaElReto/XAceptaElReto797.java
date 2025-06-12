package AceptaElReto;

/**
 * 2 3
 * 000 000 111 111 2 3 100 000 011 111 2 3 00R 011 001 100 0 0
 *
 * 0
 * 1
 * IMPOSIBLE
 */
public class XAceptaElReto797 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int fila;
        int columna;
        while (true) {
            fila = sc.nextInt();
            columna = sc.nextInt();
            sc.nextLine();
            if (fila == 0 && columna == 0) {
                break;
            }
            String[] temp;
            int movimientos = 0;
            int negativos = 0;
            int positivos = 0;
            int mixtos = 0;
            for (int i = 0; i < fila; i++) {
                temp = sc.nextLine().split(" ");
                for (int j = 0; j < columna; j++) {
                    char first = temp[0].charAt(j);
                    char second = temp[1].charAt(j);
                    if (first == second) {
                        continue;
                    } 
                    if (first == '1') {
                        positivos++;
                    } else if (first == 'R') {
                        mixtos++;
                    } else {
                        negativos++;
                    }
                }
            }
            if (positivos == 0 && mixtos == 0 && negativos == 0) {
                System.out.println("0");
            } else {
                movimientos += negativos - positivos;
                if (negativos > (positivos + mixtos)) {
                    System.out.println("IMPOSIBLE");
                } else{
                    System.out.println();
                }
            }

        }
    }
}
