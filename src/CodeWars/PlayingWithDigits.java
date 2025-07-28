package CodeWars;

public class PlayingWithDigits {
    public static void main(String[] args) {
        System.out.println(digPow(89,1));
    }
    public static long digPow(int n, int p) {
        String ns = String.valueOf(n);
        int sum = 0;
        for (int i = 0; i < ns.length(); i++) {
            sum += Math.pow(ns.charAt(i)-'0', p++);
        }

        int result;
        if (sum % n == 0) {
            return sum / n;
        } else {
            return -1;
        }
    }
}
