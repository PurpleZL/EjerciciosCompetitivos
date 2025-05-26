package AceptaElReto;

/*
9
12
FF
FIN

A
13
100
 */
import java.math.BigInteger;

public class AceptaElReto163 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    
    public static void main(String[] args) {
        String casos;
        do {
            casos = sc.nextLine();
            if (!casos.equals("FIN")) {
                BigInteger num = new BigInteger(casos, 16);
                num = num.add(BigInteger.valueOf(1));
                System.out.println(num.toString(16).toUpperCase());
            }
        } while (!casos.equals("FIN"));
    }
}