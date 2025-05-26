package AceptaElReto;

/*
    @author Señor Vlad I.C. Orza
    -Pide 2 numeros (filas y columnas)
    Se introduciran numeros enteros y positivos (no comprobar)
    -Pedira tambien una palabra al usuario
    -Se generara un array bidimensional de caracteres filasxcolumnas que se rellenara
    con los caracteres de la palabra, si no llega a rellenarse se repetira la palabra
    -Pide un metodo que recibe un array e imprimira el contenido
    -Tambien se pedira un numero de columna la usuario y  se mostrara concatenado por la primera fila
    -Todo hasta que el usuario ponga fin en el numero de FILAS
 */
public class Ejercicio03 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        String interruptor, palabra;
        int filas, columnas, contador = 0;
        char[][] array;

        do {
            System.out.println("Introduce un numero de filas: ");
            interruptor = sc.nextLine();
            if (!interruptor.equalsIgnoreCase("FIN")) {
                filas = Integer.parseInt(interruptor);
                System.out.println("Introduce un numero de columnas: ");
                columnas = sc.nextInt();
                System.out.println("Introduce una palabra: ");// lo he buscado donde esta el error out of bounds que suele estar en los arrays pero no lo veo
                palabra = sc.nextLine();
                array = new char[filas][columnas];

                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        for (int k = 0; k < j; k++) {
                            array[i][j] = palabra.charAt(contador);
                            contador++;
                            if (contador == palabra.length() - 1) {
                                contador = 0;
                            }
                        }
                    }
                }
                imprimirArray(array);
                System.out.println("Introduce un numero de columna: ");
                columnas = sc.nextInt();
                System.out.println("Resultado columnas seleccionada: ");

                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i][columnas]);
                }
            }

        } while (!interruptor.equalsIgnoreCase("FIN"));
        System.out.println("FUAAAH");
    }

    private static void imprimirArray(char[][] array) {
        for (int i = 0; i < array.length; i++) {   
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");   
        }
    }
}
