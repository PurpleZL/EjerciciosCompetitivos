package AceptaElReto;

/*
1 2019
7 106
666 1234

TOCA ESPERAR
FELIZ DECADA NUEVA
TOCA ESPERAR
 */
public class AceptaElReto539 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        while (sc.hasNext()){
            String primero=Integer.toString(sc.nextInt());
            String ultimo=Integer.toString(sc.nextInt()+1);
            if (ultimo.charAt(ultimo.length()-1)==primero.charAt(primero.length()-1)) {
                System.out.println("FELIZ DECADA NUEVA");
            }else System.out.println("TOCA ESPERAR");
        }
    }
}
