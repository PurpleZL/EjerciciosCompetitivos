package CodeWars;

public class HighestScoringWord {
    public static String high(String s) {
        String[] arr = s.split(" ");
        int highScore = 0;
        String word = "";
        for (String string : arr) {
            int score = string.chars().map(c -> c -'a'+1).sum();
            if (highScore < score){
                highScore = score;
                word = string;
            }
        }
        return word;
    }
}
/*
public static String high(String s) {
    return Arrays.stream(s.split(" "))
                .max(Comparator.comparingInt(
                        a -> a.chars().map(i -> i - 96).sum()
                )).get();
 }
*/