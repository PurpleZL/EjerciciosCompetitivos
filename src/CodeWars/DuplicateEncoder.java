package CodeWars;

public class DuplicateEncoder {
    public static void main(String[] args) {
        System.out.println(encode("Prespecialized"));
    }

    static String encode(String word) {
        StringBuilder sb = new StringBuilder();
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if (word.indexOf(word.charAt(i))
                    ==
                    word.lastIndexOf(word.charAt(i))
            ) {
                sb.append("(");
            } else sb.append(")");
        }
        return sb.toString();
    }
}
