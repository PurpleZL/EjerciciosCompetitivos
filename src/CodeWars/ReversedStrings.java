package CodeWars;

import java.util.Arrays;

public class ReversedStrings {

    public static void main(String[] args) {
        System.out.println(solution("world"));
    }
    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
