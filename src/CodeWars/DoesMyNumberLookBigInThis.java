package CodeWars;

public class DoesMyNumberLookBigInThis {
    public static boolean isNarcissistic(int number) {
        String str = String.valueOf(number);
        int strLength = str.length();
        return str.chars()
                .map(c -> Character.getNumericValue(c))
                .reduce(0,
                (a, b) -> a + (int) Math.pow(b, strLength))
                == number;
    }

    public static void main(String[] args) {
        System.out.println(isNarcissistic(153));
    }
}
