package AceptaElReto;

/*
QUERIDOS REYES MAGOS
HE SIDO MUY PERO QUE MUY BUENO
Y QUIERO QUE ME TRAIGAIS UNA ZAMBOMBA
FIN

RVFSJEPT SFZFT NBHPT
IF TJEP NVZ QFSP RVF NVZ CVFOP
Z RVJFSP RVF NF USBJHBJT VOB ABNCPNCB
 */
public class AceptaElReto364 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        String carta;
        do {
            carta = sc.nextLine();
            if (!carta.equals("FIN")) {
                String encriptado="";
                for (int i = 0; i < carta.length(); i++) {
                    if (carta.charAt(i)>='A' && carta.charAt(i)<='Z') {
                        encriptado += (char) ('A'+(carta.charAt(i)-'A'+1)%26);
                    }else encriptado += carta.charAt(i);
                }
                System.out.println(encriptado);
            }
        } while (!carta.equals("FIN"));
    }
}
