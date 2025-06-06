package CodeWars;

/**
 *
 * @author vladu
 */
public class VowelCount {
    public static void main(String[] args) {
        System.out.println(getCount("abracadabra"));
    }
    
    public static int getCount(String str) {
        return (int) str.chars().filter(
                c -> (char) c == 'a'
                || (char) c == 'e'
                || (char) c == 'i'
                || (char) c == 'o'
                || (char) c == 'u').count();
    }
}
