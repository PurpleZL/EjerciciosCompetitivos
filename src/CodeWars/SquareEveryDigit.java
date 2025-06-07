package CodeWars;

import java.util.stream.Collectors;

/**
 *
 * @author vladu
 */
public class SquareEveryDigit {
    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
    }
    public static int squareDigits(int n) {
        return Integer.parseInt(
        String.valueOf(n)
            .chars()
            .map(c -> Character.getNumericValue(c))
            .map(d -> d * d)
            .mapToObj(String::valueOf)
            .collect(Collectors.joining()));
    }
}
