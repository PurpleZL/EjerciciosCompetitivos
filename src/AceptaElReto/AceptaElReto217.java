package AceptaElReto;

public class AceptaElReto217 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int numero, contador = 0;
        int[] array = new int[1000];
        do {
            numero = sc.nextInt();
            if (numero != 0) {
                array[contador] = numero;
                contador++;
            }
        } while (numero != 0);
        ladoCalle(array, contador);
    }

    private static void ladoCalle(int[] array, int contador) {
        for (int i = 0; i < contador; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("DERECHA");
            } else {
                System.out.println("IZQUIERDA");
            }
        }
    }
}
