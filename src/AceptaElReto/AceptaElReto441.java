package AceptaElReto;

/*
1
9
1.345
1.234.567

2
10
1.346
1.234.568
 */
public class AceptaElReto441 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        while (sc.hasNextLine()) {
            String numeroConPuntos = sc.nextLine().trim();
            String numeroSinPuntos = numeroConPuntos.replace(".", "");

            StringBuilder resultado = new StringBuilder();
            int acarreo = 1;

            for (int i = numeroSinPuntos.length() - 1; i >= 0; i--) {
                char digitoChar = numeroSinPuntos.charAt(i);
                int digito = Character.getNumericValue(digitoChar);

                int suma = digito + acarreo;
                if (suma >= 10) {
                    acarreo = 1;
                    suma -= 10;
                } else {
                    acarreo = 0;
                }
                resultado.insert(0, suma);
            }

            if (acarreo > 0) {
                resultado.insert(0, acarreo);
            }

            String resultadoConPuntos = insertarPuntos(resultado.toString());
            System.out.println(resultadoConPuntos);
        }
    }

    private static String insertarPuntos(String numero) {
        StringBuilder sb = new StringBuilder(numero);
        int longitud = sb.length();
        for (int i = longitud - 3; i > 0; i -= 3) {
            sb.insert(i, '.');
        }
        return sb.toString();
    }
}