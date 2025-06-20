package CodeWars;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;


/*

 */
public class DescendingOrder {

    public static void main(String[] args) {
        System.out.println(sortDesc(54421));
    }

    public static int sortDesc(final int num) {
        return Integer.parseInt(
                Arrays.stream(String.valueOf(num).split(""))
                        .sorted(Collections.reverseOrder())
                        .collect(Collectors.joining()));
    }
}
