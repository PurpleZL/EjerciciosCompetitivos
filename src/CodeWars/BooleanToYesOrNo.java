package CodeWars;

public class BooleanToYesOrNo {
    public static void main(String[] args) {
        System.out.println(boolToWord(true));
    }

    public static String boolToWord(boolean b) {
        return b? "Yes":"No";
    }
}
