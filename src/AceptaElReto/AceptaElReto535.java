package AceptaElReto;

/*
3
0 1 2
5
8 3 4 2 8
0

3
15
 */
public class AceptaElReto535 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos;
        int alturaPoblacion;
        do {
            casos = sc.nextInt();
            if (casos != 0) {
                int totalAgua = 0;
                for (int i = 0; i < casos - 1; i++) {
                    totalAgua += sc.nextInt();
                }
                alturaPoblacion = sc.nextInt();
                System.out.println(((casos - 1) * alturaPoblacion) - totalAgua);
            }
        } while (casos != 0);
    }
}
