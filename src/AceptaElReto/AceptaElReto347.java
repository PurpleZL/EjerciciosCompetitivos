package AceptaElReto;

/*
297 210
10 10
9 100
0 0

7
1
0
 */
public class AceptaElReto347 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        int ancho;
        int alto;
        do {
            ancho = sc.nextInt();
            alto = sc.nextInt();
            if (ancho != 0 && alto != 0) {
                System.out.println(pajaritas(ancho, alto));
            }
        } while (ancho != 0 && alto != 0);
    }

    private static int pajaritas(int ancho, int alto) {
        int counter = 0;
        while (ancho >= 10 && alto >= 10) {
            int lado = Math.min(ancho, alto);
            counter += Math.max(ancho, alto) / lado;
            
            if (ancho > alto) {
                ancho = ancho % lado;
            } else {
                alto = alto % lado;
            }
        }
        return counter;
    }
}
