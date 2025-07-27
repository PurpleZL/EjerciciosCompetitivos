package CodeWars;

public class DetectPangram {
    public boolean check(String sentence){
        sentence = sentence.toLowerCase();
        for (int i = 0; i <= 26; i++) {
            if (!sentence.contains(String.valueOf((char) i + 'a'))) return false;
        }
        return true;
    }
}
