package CodeWars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertStringToCamelCase {
    static String toCamelCase(String s){
        String[] str = (s.indexOf("-") != -1) ? s.split("-") : s.split("_");
        StringBuilder sb = new StringBuilder();
        sb.append(str[0]);
        for (int i = 1; i < str.length; i++) {
            sb.append(Character.toUpperCase(str[i].charAt(0))+str[i].substring(1));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(toCamelCase("The_Stealth_Warrior"));
    }
}
