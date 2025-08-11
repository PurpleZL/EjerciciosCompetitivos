package CodeWars;

public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        StringBuilder sb = new StringBuilder(str1);
        for (char c : str2.toCharArray()) {
            int index = sb.indexOf(String.valueOf(c));
            if (index == -1) {
                return false;
            }
            sb.deleteCharAt(index);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(scramble("scriptjavx","javascript"));
        System.out.println(scramble("cedewaraaossoqqyt","codewars"));
    }
}
