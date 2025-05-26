package AceptaElReto;

/*
3
Polisilaba es polisilaba
NARANJA es naranja
Mandarina es naranja

TAUTOLOGIA
TAUTOLOGIA
NO TAUTOLOGIA
 */
public class AceptaElReto467 {
static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < casos; i++) {
            String palabra = sc.nextLine();
            String[] array= palabra.split(" ");
            if (array[0].equalsIgnoreCase(array[2])) {
                System.out.println("TAUTOLOGIA");
            }else System.out.println("NO TAUTOLOGIA");
        }
    }    
}
