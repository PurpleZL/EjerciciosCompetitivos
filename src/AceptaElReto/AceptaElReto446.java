package AceptaElReto;

/*
3
mireia 5 ximo vicente maria vicente mireia
juan 2 juan maria
ximo 1 ximo

VERDADERA
FALSA
FALSA
 */
public class AceptaElReto446 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        int casos;
        casos = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < casos; i++) {
            String[] nombres= sc.nextLine().split(" ");
            System.out.println(esAbuela(nombres)? "VERDADERA":"FALSA");
        }
    }

    private static boolean esAbuela(String[] nombres) {
        if (nombres.length<=3) {
            return false;
        }
        
        if (!nombres[0].equals(nombres[nombres.length -1])) {
            return false;
        }
        
        for (int i = 2; i < nombres.length-1; i++) {
            if (nombres[0].equals(nombres[i])) {
                return false;
            }
        }
        
        return true;
    }
}

/*
public class AceptaElReto446 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < casos; i++) {
            String linea = sc.nextLine();
            String[] partes = linea.split(" ");
            String nombreReal = partes[0];
            int numNombres = Integer.parseInt(partes[1]);
            boolean esVerdadera = true;

            if (numNombres < 2 || !partes[partes.length - 1].equals(nombreReal)) {
                esVerdadera = false;
            } else {
                for (int j = 2; j < partes.length - 1; j++) {
                    if (partes[j].equals(nombreReal)) {
                        esVerdadera = false;
                        break;
                    }
                }
            }
            System.out.println(esVerdadera ? "VERDADERA" : "FALSA");
        }
    }
}
*/
