package AceptaElReto;

/*
3
08:05
12:00
10:09

03:55
12:00
01:51
 */
public class AceptaElReto153 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        int casos = sc.nextInt();
        sc.nextLine();
        String espejo;
        int hora;
        int minuto;

        for (int i = 0; i < casos; i++) {
            espejo = sc.nextLine();

            hora = Integer.parseInt(espejo.split(":")[0]);
            minuto = Integer.parseInt(espejo.split(":")[1]);

            if (hora == 12) hora = 0;

            minuto = 60 - minuto;
            if (minuto == 60) minuto = 0;

            hora = (minuto != 0) ? 11 - hora : 12 - hora;
            if (hora == 0) hora = 12;

            System.out.printf("%02d:%02d\n", hora, minuto);
        }
    }
}

