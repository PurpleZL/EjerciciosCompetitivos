package CodeWars;


public class ConsecutiveStrings {
    public static String longestConsec(String[] strarr, int k) {
        int len = strarr.length-(k-1);
        String maxString= "";
        int maxLen = 0;
        for (int i = 0; i < len; i++) {
            String test = "";
            for (int j = 0; j < k; j++) {
                test += strarr[i+j];
            }
            if (test.length() > maxLen){
                maxLen=test.length();
                maxString=test;
            }
        }
        return maxString;
    }

    public static void main(String[] args) {
        System.out.println(longestConsec(new String[] {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1));
    }
}
