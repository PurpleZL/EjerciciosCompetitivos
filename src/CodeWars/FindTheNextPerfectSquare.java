package CodeWars;

public class FindTheNextPerfectSquare {
    public static long findNextSquare(long sq) {
        double n = Math.sqrt(sq);
        if (n % (int) n != 0) return -1;
        return (long) Math.pow(n+1,2);
    }
}