package CodeWars;

public class YoureASquare {
    public static void main(String[] args) {
        System.out.println(isSquare(25));
    }
    public static boolean isSquare(int n) {
        return (Math.sqrt((double) n) % 1 == 0)? true:false;
    }
}
