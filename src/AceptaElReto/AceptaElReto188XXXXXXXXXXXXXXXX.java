package AceptaElReto;


public class AceptaElReto188XXXXXXXXXXXXXXXX {
    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        String input;
        while (sc.hasNextLine()) {
            input = sc.nextLine().trim();
            if (input.isEmpty()) break;
            
            String[] array = input.split(" ");
            boolean aceptado = true;
            if (array.length==1) {
                System.out.println("Si");
                break;
            }else{   
            for (int i = 0; i < array.length - 1; i++) {
                if (!array[i].substring(array[i].length()-2).equals(array[i+1].substring(0,2))) {
                    aceptado = false;
                    break;
                }
            }
            }
            System.out.println(aceptado ? "Si" : "No");
        }
    }
}

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