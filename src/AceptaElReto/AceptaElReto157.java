package AceptaElReto;

public class AceptaElReto157 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos, dia, mes, suma;

        casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            dia = sc.nextInt();
            mes = sc.nextInt();
            suma=0;
            for (int j = 1; j < mes; j++) {
                if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12) {
                    suma+=31;
                } else if (j == 4 || j == 6 || j == 9 || j == 11) {
                    suma+=30;
                } else {
                    suma+=28;
                }
            }
            System.out.println(365-(suma+dia));
        }
    }
}
