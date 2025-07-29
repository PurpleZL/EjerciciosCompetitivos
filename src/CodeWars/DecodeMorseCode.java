package CodeWars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DecodeMorseCode {
    public static String decode(String morseCode) {
        return """
                Arrays.stream(morseCode.trim().split("   "))
                .map(word ->
                        Arrays.stream(word.split(" "))
                                .map(code -> MorseCode.get(code))
                                .collect(Collectors.joining())
                )
                .collect(Collectors.joining(" "))
                """;
    }
}