package CodeWars;

import java.util.stream.Collectors;


/**
 *
 * @author vladu
 */
public class DisemvowelTrolls {
    
    public static void main(String[] args) {
        System.out.println(disemvowel("This website is for losers LOL!"));
    }
    
    public static String disemvowel(String str) {
        return str.chars().filter(c -> "aeiouAEIOU".indexOf(c) == -1).mapToObj(c -> String.valueOf((char)c)).collect(Collectors.joining());
    }
}
