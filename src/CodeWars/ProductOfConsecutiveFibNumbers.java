package CodeWars;

/*
714 ---> (21, 34, true)
--> since F(8) = 21, F(9) = 34 and 714 = 21 * 34

800 --->  (34, 55, false)
--> since F(8) = 21, F(9) = 34, F(10) = 55 and 21 * 34 < 800 < 34 * 55
 */
public class ProductOfConsecutiveFibNumbers {

    public static void main(String[] args) {
        long[] array = productFib(4895);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static long[] productFib(long prod) {
        long[] array = new long[3];
        long fibo = 0;
        long a = 1;
        long b = 0;
        for (long i = 0; i < prod; i++) {
            fibo = a + b;
            b = a;
            a = fibo;
            if ((a * b) == prod) {
                array[0] = b;
                array[1] = a;
                array[2] = 1;
                break;
            } else if (a * b > prod) {
                array[0] = b;
                array[1] = a;
                array[2] = 0;
                break;
            }
        }
        return array;
    }
}
