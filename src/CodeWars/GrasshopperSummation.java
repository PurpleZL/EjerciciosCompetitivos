package CodeWars;

public class GrasshopperSummation {
    public static int summation(int n) {
        if (n==1) return 1;
        return n+summation(n-1);
    }

    public static void main(String[] args) {
        System.out.println(summation(8));
    }
}
