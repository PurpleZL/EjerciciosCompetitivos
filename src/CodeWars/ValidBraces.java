package CodeWars;

import java.util.LinkedList;

public class ValidBraces {

        public static boolean isValid(String braces) {
            LinkedList<String> ll = new LinkedList<>();
            for (int i = 0; i < braces.length(); i++) {
                char c = braces.charAt(i);
                if (c == '(' || c == '[' || c == '{') {
                    ll.push("" + c);
                } else {
                    if (ll.isEmpty()) {
                        return false;
                    }
                    String last = ll.pop();
                    if ((c == ')' && !last.equals("(")) ||
                            (c == ']' && !last.equals("[")) ||
                            (c == '}' && !last.equals("{"))) {
                        return false;
                    }
                }
            }
            return ll.isEmpty();
        }

    public static void main(String[] args) {
        System.out.println(isValid("([{}])"));
    }
}
