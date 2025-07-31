package CodeWars;

import java.util.Arrays;

public class SplitStrings {
    public static String[] solution(String s) {
        String[] arr = new String[(s.length()+1)/2];
        for (int i = 0; i < s.length(); i+=2) {
            if (i+1 < s.length()){
                arr[i/2]= String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i+1));
            }else arr[i/2]= String.valueOf(s.charAt(i)) + "_";
        }
        return arr;
    }
}
