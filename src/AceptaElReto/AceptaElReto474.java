package AceptaElReto;

/*
2
100 150 200
300 100 700

100
800
 */
public class AceptaElReto474 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            int inicio = sc.nextInt();
            int punto1 = sc.nextInt();
            int punto2 = sc.nextInt();
            int total;
            int distancia1 = Math.abs(inicio - punto1) + Math.abs(punto1 - punto2);
            int distancia2 = Math.abs(inicio - punto2) + Math.abs(punto2 - punto1);
            total = Math.min(distancia1, distancia2);
            System.out.println(total);
        }
    }
}
