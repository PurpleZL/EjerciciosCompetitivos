package AceptaElReto;
/*
    @author Señor Vlad I.C. Orza
    Condiciones contraseña:
    -Longitud igual o superior a 8
    -Al menos una letra minuscula
    -Al menos una letra mayuscula
    -Al menos un caracter numerico
    -Al menos uno de los caracreres especiales: *!$&?%
    
    Necesario crear un metodo isFuerte que reciba la cadena y sea booleano
    Se repite hasta que se hayan introducido 3 contraseñas fuertes
Ejemplo:
Introduce una cadena: estasedebil
Salida: no es fuerte
 */
public class Ejercicio01 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        String cadena;
        int contador=0;
        do {
            if (contador<3) {
            System.out.println("Introduce una cadena de caracteres: ");    
            cadena=sc.nextLine();
                if (isFuerte(cadena)) {
                    System.out.println("Válida, es fuerte.");
                    contador++;
                }else{
                    System.out.println("No válida, no es fuerte.");
                }
            }
        } while (contador<3);
        System.out.println("Chao Pescao");
    }

    private static boolean isFuerte(String cadena) {
        String requisitoContraseña= "[a-zA-Z0-9&&[*!$&?%]]{8,}"; //regex incorrecto
        if (cadena.matches(requisitoContraseña)) {
            return true;
        }
        return false;
    }
}

/*
Hola
H9*La45
*IESEuropa2000
Hol4!aeiou
*/
