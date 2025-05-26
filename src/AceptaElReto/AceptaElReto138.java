package AceptaElReto;

public class AceptaElReto138 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        long casos, numero, ceros;
        casos = sc.nextLong();
        for (int i = 0; i < casos; i++) {
            numero=sc.nextLong();
            ceros=0;
            do {
                if (numero > 0) {
                    numero/=5;
                    ceros+=numero;
                }               
            } while (numero > 0);
            System.out.println(ceros);
        }
    }
}
