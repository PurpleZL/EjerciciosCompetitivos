package CodeWars;

public class BreakCamelCase {
    public static String camelCase(String input) {
        if (input.isBlank()) return "";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isUpperCase(currentChar)) {
                if (i > 0) {
                    sb.append(' ');
                }
                sb.append(currentChar);
            } else {
                sb.append(currentChar);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(camelCase("camelCasing"));
    }
}


