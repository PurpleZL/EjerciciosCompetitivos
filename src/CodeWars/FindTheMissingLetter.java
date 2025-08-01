package CodeWars;

import java.util.stream.IntStream;

public class FindTheMissingLetter {
    public static char findMissingLetter(char[] array) {
        return IntStream.range(0, array.length - 1)
                .filter(i -> (array[i + 1] - array[i]) > 1)
                .mapToObj(i -> (char) (array[i]+1)).findFirst().orElse(' ');
    }
}
