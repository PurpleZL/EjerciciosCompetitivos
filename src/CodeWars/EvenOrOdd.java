package CodeWars;
/*

 */
public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println(evenOrOdd(4));
    }
    public static String evenOrOdd(int number) {
        if (number%2==0) {
            return "Even";
        }else   return "Odd";
    }
}
