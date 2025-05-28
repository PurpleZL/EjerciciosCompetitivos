package AceptaElReto;

/*
2
100 0
50 50

100
0
 */
public class AceptaElReto583 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        long casos = sc.nextInt();
        for (long i = 0; i < casos; i++) {
            long resComprometedora = sc.nextInt();
            long resVerdadera = sc.nextInt();
            long total = resComprometedora + resVerdadera;
            
//            int real = (int) (resComprometedora - total/2);
//            int porcentaje = (int) ((real * 100) / (total/2));
            long real = 2 * resComprometedora - total;
            long porcentaje = (real * 100) / total;
            
            if (porcentaje < 0) {
                System.out.println("0");
            } else if (porcentaje > 100) {
                System.out.println("100");
            } else {
                System.out.println(porcentaje);
            }
        }
    }
}
