package AceptaElReto;

/*
entre 1 y 50 palabras
mínimo de 2 caracteres y un máximo de 24

gugutata
mata tapa papa pato
seto taco coma matute
sien encima mapa patuco comida
cata tasama malote tejaba batama
kiosko comida

SI
SI
NO
SI
SI
NO
 */

public class AceptaElReto188 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        while (sc.hasNextLine()) {
            String[] palabras = sc.nextLine().split(" ");
            boolean aceptado = true;
            if (palabras.length <= 1) {
                System.out.println("SI");
                continue;
            }
            for (int i = 0; i < palabras.length-1; i++) {
                if (!palabras[i].substring(palabras[i].length()-2, palabras[i].length()).equals(
                    palabras[i+1].substring(0,2))) {
                    aceptado = false;
                    break;
                }
            }
            System.out.println(aceptado ? "SI" : "NO");
        }
    }
}

