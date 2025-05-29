package AceptaElReto;

/*
3
1000 200 10
1000 100 1
1000 100 10

HORAS
ENCENDIDOS
AMBAS
*/
public class AceptaElReto584 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        int casos = sc.nextInt();
        for (int x = 0; x < casos; x++) {
            int i = sc.nextInt();
            int e = sc.nextInt();
            int di = sc.nextInt();
            
            long resultado = i - e * di;
            if (resultado > 0) {
                System.out.println("ENCENDIDOS");
            }else if (resultado < 0) {
                System.out.println("HORAS");
            }else System.out.println("AMBAS");
        }
    }
}
