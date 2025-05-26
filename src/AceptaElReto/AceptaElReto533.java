package AceptaElReto;

/*
4
1
8 10 12 0
2
9 9 0
10
8 8 80 5 5 0
10
1 1 1 1 1 0

1
2
3
SIGAMOS RECICLANDO
 */
public class AceptaElReto533 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            int cupo = sc.nextInt() * 8;
            int botellas;
            int concursante=0;
            boolean cupoAlcanzado = false;
            do {
                botellas = sc.nextInt();
                if (botellas != 0) {
                    cupo -= botellas;
                    concursante++;
                    if (cupo <= 0) {
                        cupoAlcanzado = true;
                        sc.nextLine();
                        break;
                    }
                }
            } while (botellas != 0);
            System.out.println(cupoAlcanzado?concursante:"SIGAMOS RECICLANDO");
        }
    }
}
