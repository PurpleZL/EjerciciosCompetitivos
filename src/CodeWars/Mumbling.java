package CodeWars;

public class Mumbling {
    public static void main(String[] args) {
        System.out.println(accum("AbC"));
    }

    public static String accum(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == 0) {
                    sb.append(Character.toUpperCase(s.charAt(i)));
                } else {
                    sb.append(Character.toLowerCase(s.charAt(i)));
                }
            }
            if (i != s.length() - 1) sb.append("-");
        }
        return sb.toString();
    }
}
