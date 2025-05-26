package AceptaElReto;

/*
2
7 18 6 5
10 10 10 0

113 239
100 200
 */
public class AceptaElReto540 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos=sc.nextInt();
        for (int i = 0; i < casos; i++) {
           int pisomax=sc.nextInt();
           int escalones=sc.nextInt();
           int pisoactual=sc.nextInt();
           int escalonesextra=sc.nextInt();
            System.out.println(pisoactual*escalones+escalonesextra+" "+(pisomax*escalones+pisoactual*escalones+escalonesextra));
        }
    }
}
