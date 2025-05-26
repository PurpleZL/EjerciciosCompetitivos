package AceptaElReto;

/*
381654729
102
9876
67

POLIDIVISIBLE
POLIDIVISIBLE
POLIDIVISIBLE
NO POLIDIVISIBLE
un número es polidivisible si es divisible por su longitud y, además, si se le quita el último dígito queda un número que es a su vez polidivisible.
 */
public class AceptaElReto237 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        long num;
        while (sc.hasNextLong()) {
            num = sc.nextLong();
            System.out.println((esPolidivisible(num)) ? "POLIDIVISIBLE" : "NO POLIDIVISIBLE");
        }
    }

    private static boolean esPolidivisible(long num) {
        int longitud = String.valueOf(num).length();
        if (longitud == 1) {
            return true;
        }
        if (num % longitud != 0) {
            return false;
        } else {
            return esPolidivisible(num / 10);
        }
    }
}
