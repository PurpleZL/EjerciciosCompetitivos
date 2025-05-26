package AceptaElReto;

/*
3
...
...X.
XXX.X.

1
2
1
 */
public class AceptaElReto194 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < casos; i++) {
            String carretera = sc.nextLine();
            int pasos = 0;
            int cubre = 0;

            while (cubre < carretera.length()) {
                if (carretera.charAt(cubre) == '.') {
                    pasos++;
                    cubre += 3;
                } else {
                    cubre++;
                }
            }

            System.out.println(pasos);
        }
    }
}