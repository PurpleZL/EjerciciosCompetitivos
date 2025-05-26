package AceptaElReto;

/*
    @author Señor Vlad I.C. Orza
    -Numero bonico: la suma de sus cifras pares es igual que la suma de sus numeros impares
    Ejemplo: 112 es bonito, 152 no lo es.
    -El programa finaliza con el input "fin"
    -Se pide un metodo que recima el numero y devuelva un booleano que indique si es bonito
    -Tambien se debe mostrar cual fue el numero mas bajo o mas alto
 */
public class Ejercicio02 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        String respuesta;
        int numero, comparativoMayor = 0, comparativoMenor = 999999; //QUIERO CAMBIAR ESTO
        do {
            System.out.println("Numero: ");
            respuesta = sc.nextLine();
            if (!respuesta.equalsIgnoreCase("fin")) {

                numero = Integer.parseInt(respuesta); //preferi hacer que el metodo recibiera un string y tener que sanitizar la entrada
                if (esBonito(respuesta)) {
                    System.out.println("Es bonito");
                    if (numero > comparativoMayor) {
                        comparativoMayor = numero;
                    }
                    if (numero < comparativoMenor) {
                        comparativoMenor = numero;
                    }
                } else {
                    System.out.println("No es bonito, es horrendo");
                }

            }
        } while (!respuesta.equalsIgnoreCase("fin"));
        System.out.println("Dentro de los numero bonitos el mas grande es: " + comparativoMayor + " y el mas pequeño: " + comparativoMenor);
        System.out.println("Vengaaa, hasta luego!");
    }

    private static boolean esBonito(String respuesta) {
        int totalPar = 0, totalImpar = 0;
        char digito;
        for (int i = 0; i < respuesta.length(); i++) {
            digito = (char) Character.getNumericValue(respuesta.charAt(i));
            if (digito % 2 == 0) {
                totalPar += digito;
            } else {
                totalImpar += digito;
            }
        }
        if (totalPar == totalImpar) {
            return true;
        } else {
            return false;
        }
    }
}
/*
112
152
10506
*/
