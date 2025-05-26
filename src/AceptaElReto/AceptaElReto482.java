package AceptaElReto;

/*

 */
public class AceptaElReto482 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        String respuesta = "";
        int counterN = 0;
        int counterG = 0;
        do {
            respuesta = sc.nextLine();
            if (!respuesta.equals(".")) {
                counterN = 0;
                counterG = 0;
                char[] array = new char[respuesta.length()];
                for (int i = 0; i < respuesta.length(); i++) {
                    array[i] = respuesta.charAt(i);
                }
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == 'N') {
                        counterN++;
                    } else if (array[i] == 'G') {
                        counterG++;
                    }
                }
                if (counterN % 2 == 0 && counterG % 2 == 0) {
                    System.out.println("EMPAREJADOS");
                } else if (counterN % 2 == 1 && counterG % 2 == 1) {
                    System.out.println("PAREJA MIXTA");
                } else if (counterN % 2 != 0) {
                    System.out.println("NEGRO SOLITARIO");
                } else if (counterG % 2 != 0) {
                    System.out.println("GRIS SOLITARIO");
                }
            }
        } while (!respuesta.equals("."));
    }
}
