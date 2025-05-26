package AceptaElReto;

/*
3
120 / 70
70 / 120
120 / 120

BIEN
MAL
BIEN
 */
public class AceptaElReto506 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < casos; i++) {
            String datos=sc.nextLine();
            int max=Integer.parseInt(datos.substring(0, datos.indexOf(" / ")));
            int min=Integer.parseInt(datos.substring(datos.indexOf(" / ")+3,datos.length()));
            if (max>=min) {
                System.out.println("BIEN");
            }else System.out.println("MAL");
        }
    }
}
