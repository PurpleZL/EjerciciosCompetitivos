package AceptaElReto;

/*
V V A .
I V V I A I .
A .
.

VERANO
INVIERNO
EMPATE
 */
public class AceptaElReto605 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        String casos;
        while(!(casos = sc.nextLine().replace(" ", "")).startsWith(".")){
            int v = 0;
            int i = 0;
            int a = 0;
            for (int j = 0; j < casos.length()-1; j++) {
                char c = casos.charAt(j);
                if (c == 'V') {
                    v++;
                }else if (c == 'I') {
                    i++;
                }
            }
            if (v > i) {
                System.out.println("VERANO");
            }else if (i > v) {
                System.out.println("INVIERNO");
            }else System.out.println("EMPATE");
        }
    }
}
/*
        while (true) {
            String linea = sc.nextLine();
            if (linea.equals(".")) {
                break;
            }

            int verano = 0;
            int invierno = 0;

            for (int i = 0; i < linea.length(); i++) {
                char c = linea.charAt(i);

                if (c == 'V') {
                    verano++;
                } else if (c == 'I') {
                    invierno++;
                }
            }

            if (verano > invierno) {
                System.out.println("VERANO");
            } else if (invierno > verano) {
                System.out.println("INVIERNO");
            } else {
                System.out.println("EMPATE");
            }
        }
*/
