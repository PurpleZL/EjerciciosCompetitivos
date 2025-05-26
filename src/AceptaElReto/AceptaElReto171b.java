package AceptaElReto;

/*
5 3000 3500 3200 3400 3200
4 4000 3500 3500 3200
0

3
3
 */
public class AceptaElReto171b {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        int abadias = 0;
        int maxAltura = 0;
        String[] partes;
        int n;
        do {
            partes = sc.nextLine().split(" ");
            if (!partes[0].equals("0")) {
                n = Integer.parseInt(partes[0]);
                maxAltura = 0;
                abadias = 0;
                for (int i = n; i >= 1; i--) {
                    if (Integer.parseInt(partes[i]) > maxAltura) {
                        abadias++;
                        maxAltura = Integer.parseInt(partes[i]);
                    }
                }

                System.out.println(abadias);
            }
        } while (!partes[0].equals("0"));
    }
}
