package AceptaElReto;

/*
2
5 4
5
1 2 1 2 1
1
8
0

9 4
7 6 4 3 1
8
 */
public class AceptaElReto485 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos;
        do {
            casos = sc.nextInt();
            sc.nextLine();
            if (casos != 0) {
                String[] etapas = sc.nextLine().split(" ");
                int total = 0;
                for (int i = 0; i < casos; i++) {
                    total += Integer.parseInt(etapas[i]);
                }
                for (int i = 0; i < casos; i++) {
                    if (i != casos - 1) {
                        System.out.print(total + " ");
                    }else System.out.println(total);
                    total -= Integer.parseInt(etapas[i]);
                }
            }
        } while (casos != 0);
    }
}
