package AceptaElReto;

/*
10
40
0

4
9
 */
public class AceptaElReto433 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int uvas;
        do {
            uvas = sc.nextInt();
            if (uvas != 0) {
                System.out.println(niveles(uvas));
            }
        } while (uvas != 0);
    }

    private static int niveles(int uvas) {
        int nivel = 0;
        int total = 0;
        while (total < uvas) {
            total += nivel + 1;
            nivel++;
        }
        return nivel;
    }
}
