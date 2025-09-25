package CodeWars;

import java.math.BigInteger;

public class PerimeterOfSquaresInARectangle {
    public static void main(String[] args) {
        System.out.println(perimeter(BigInteger.valueOf(5)));
    }
    public static BigInteger perimeter(BigInteger n) {
        BigInteger per = BigInteger.ZERO;
        BigInteger actual = BigInteger.ONE;
        BigInteger last = BigInteger.ONE;
        BigInteger temp;

        for (BigInteger i = BigInteger.ZERO; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            per = per.add(last.multiply(BigInteger.valueOf(4)));
            temp = last;
            last = actual;
            actual = actual.add(temp);
        }
        return per;
    }
}
