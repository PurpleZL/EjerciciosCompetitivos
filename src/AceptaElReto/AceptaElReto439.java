package AceptaElReto;

/*
3
D=32 T=4
T=4 V=8
V=8 D=32

V=8
D=32
T=4
 */
public class AceptaElReto439 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        int casos = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < casos; i++) {
            String[] datos = sc.nextLine().split(" ");
            String dato1 = datos[0];
            String dato2 = datos[1];

            int valor1 = Integer.parseInt(dato1.substring(2));
            int valor2 = Integer.parseInt(dato2.substring(2));
            char tipo1 = dato1.charAt(0);
            char tipo2 = dato2.charAt(0);

            if (tipo1 == 'D' && tipo2 == 'T') {
                int V = valor1 / valor2;
                System.out.println("V=" + V);
            } else if (tipo1 == 'T' && tipo2 == 'D') {
                int V = valor2 / valor1;
                System.out.println("V=" + V);
            } else if (tipo1 == 'V' && tipo2 == 'T') {
                int D = valor1 * valor2;
                System.out.println("D=" + D);
            } else if (tipo1 == 'T' && tipo2 == 'V') {
                int D = valor2 * valor1;
                System.out.println("D=" + D);
            } else if (tipo1 == 'D' && tipo2 == 'V') {
                int T = valor1 / valor2;
                System.out.println("T=" + T);
            } else if (tipo1 == 'V' && tipo2 == 'D') {
                int T = valor2 / valor1;
                System.out.println("T=" + T);
            }
        }
    }
}
