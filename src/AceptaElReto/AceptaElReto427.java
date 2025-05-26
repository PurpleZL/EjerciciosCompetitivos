package AceptaElReto;

public class AceptaElReto427 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int noCasos;
        noCasos = sc.nextInt();
        salida(noCasos);
    }

    private static void salida(int noCasos) {
        String nombre, padre;
        String[] respuestas = new String[noCasos*2];
        sc.nextLine();
        for (int i = 0; i < noCasos; i++) {
            nombre = sc.nextLine();
            padre = sc.nextLine();
            respuestas[i + i] = nombre;
            respuestas[i + i + 1] = padre;
        }
        for (int i = 0; i < respuestas.length/2; i++) {
            if (!respuestas[i+i].equals("Luke") || !respuestas[i+i+1].equals("padre") ) {
                System.out.println(respuestas[i+i]+", yo soy tu "+respuestas[i+i+1]);
            }else{
                System.out.println("TOP SECRET");
            }
        }
    }
}
