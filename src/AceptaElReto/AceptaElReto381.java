package AceptaElReto;

/*
2
4 2
3
2 3 5
0

4
30
 */

public class AceptaElReto381 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        int planetas;
        
        do {
            planetas = sc.nextInt();
            if (planetas != 0) {
                int[] periodos = new int[planetas];
                for (int i = 0; i < planetas; i++) {
                    periodos[i] = sc.nextInt();
                }
                System.out.println(calcularMCM(periodos));
            }
        } while (planetas != 0);
    }

    private static int mcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static int calcularMCM(int[] numeros) {
        int mcm = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            mcm = (mcm * numeros[i]) / mcd(mcm, numeros[i]);
        }
        return mcm;
    }
}
