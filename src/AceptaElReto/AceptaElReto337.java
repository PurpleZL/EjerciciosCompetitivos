package AceptaElReto;

/*
2
1 3 1 3 1 3
3 1 3 1 3 1
1 1 1 1 1 1
1 2 1 1 1 1

SI
NO
 */
public class AceptaElReto337 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < casos; i++) {
            String[] superiores = sc.nextLine().split(" ");
            String[] inferiores = sc.nextLine().split(" ");
            System.out.println(encajan(superiores, inferiores) ? "SI" : "NO");
        }
    }

    private static boolean encajan(String[] sup, String[] inf) {
        if (sup.length == 0 || inf.length == 0) {
            return false;
        }

        int suma = Integer.parseInt(sup[0]) + Integer.parseInt(inf[0]);

        for (int i = 1; i < sup.length; i++) {
            if (Integer.parseInt(sup[i]) + Integer.parseInt(inf[i]) != suma) {
                return false;
            }
        }
        return true;
    }
}
