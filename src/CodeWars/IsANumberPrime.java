package CodeWars;

public class IsANumberPrime {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        int limit =(int) Math.sqrt(num);
        for (int i = 2; i <= limit; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(352568543));
    }
}
