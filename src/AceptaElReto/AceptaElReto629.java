package AceptaElReto;

/*
3
1 0 1
5
0 1 0 1 2
0

1
3
 */
public class AceptaElReto629 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        int casas;
        while (true) {
            casas = sc.nextInt();
            if (casas == 0) break;
            int[] alcances = new int[casas];
            for (int i = 0; i < casas; i++) {
                alcances[i] = sc.nextInt();
            }
            int[] diferencia = new int[casas + 1];
            for (int i = 0; i < casas; i++) {
                int d = alcances[i];
                if (d > 0) {
                    int inicio = Math.max(0, i - d);
                    diferencia[inicio]++;
                    if (i < casas) {
                        diferencia[i]--;
                    }
                }
            }

            int contador = 0;
            int actual = 0;
            for (int i = 0; i < casas; i++) {
                actual += diferencia[i];
                if (actual > 0) {
                    contador++;
                }
            }
            System.out.println(contador);
        }
    }
}
