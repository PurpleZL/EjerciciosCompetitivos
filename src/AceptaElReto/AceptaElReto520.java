package AceptaElReto;

/*
3 1
1 2 2 1 0 0
3 1
1 2 1 3 0 0
0 0

1
2
 */
public class AceptaElReto520 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        int cubiles;
        int bola;

        while (true) {
            cubiles = sc.nextInt();
            bola = sc.nextInt();
            if (cubiles== 0 && bola == 0) {
                break;
            }
            int bolaPos = bola;

            while (true) {
                int intercambio1 = sc.nextInt();
                int intercambio2 = sc.nextInt();
                if (intercambio1 == 0 && intercambio2 == 0) {
                    break;
                }
                if (bolaPos == intercambio1) {
                    bolaPos = intercambio2;
                } 
                else if (bolaPos == intercambio2) {
                    bolaPos = intercambio1;
                }
            }
            System.out.println(bolaPos);
        }
    }
}
