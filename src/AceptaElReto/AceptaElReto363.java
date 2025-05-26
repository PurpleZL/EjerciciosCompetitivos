package AceptaElReto;

/*
100
3
100 100 101
100
2
500 700
0

4
12
 */
public class AceptaElReto363 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        int entrenamiento;
        int casos;
        int comida;
        do {
            entrenamiento = sc.nextInt();
            if (entrenamiento != 0) {
                casos = sc.nextInt();
                comida = 0;
                for (int i = 0; i < casos; i++) {
                    comida += sc.nextInt();
                }
                System.out.println((comida % entrenamiento == 0)? (comida/entrenamiento) : ((comida/entrenamiento) +1));
            }
        } while (entrenamiento != 0);
    }
}
