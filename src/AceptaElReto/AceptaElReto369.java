package AceptaElReto;

public class AceptaElReto369 {

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
        baseUno(array, contador);
    }

    private static void baseUno(int[] array, int contador) {
        Character uno = '1';
        for (int i = 0; i < contador; i++) {
            for (int j = 0; j < array[i]; j++) {
                System.out.print(uno);
            }
            System.out.println("");
        }
    }
}
