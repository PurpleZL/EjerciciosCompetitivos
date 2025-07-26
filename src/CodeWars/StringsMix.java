package CodeWars;

/*
s1="Are the kids at home? aaaaa fffff"
s2="Yes they are here! aaaaa fffff"
mix(s1, s2) --> "=:aaaaaa/2:eeeee/=:fffff/1:tt/2:rr/=:hh"
*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StringsMix {
    public static void main(String[] args) {
        System.out.println(mix("Are the kids at home? aaaaa fffff", "Yes they are here! aaaaa fffff"));
    }

    public static String mix(String s1, String s2) {
        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (char c : s1.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                count1[c - 'a']++;
            }
        }
        for (char c : s2.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                count2[c - 'a']++;
            }
        }

        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            int max = Math.max(count1[i], count2[i]);
            if (max <= 1) continue;

            char c = (char) ('a' + i);
            String prefix;
            if (count1[i] > count2[i]) {
                prefix = "1:" + String.valueOf(c).repeat(max);
            } else if (count2[i] > count1[i]) {
                prefix = "2:" + String.valueOf(c).repeat(max);
            } else {
                prefix = "=:" + String.valueOf(c).repeat(max);
            }
            result.add(prefix);
        }

        Collections.sort(result, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if (a.length() != b.length()) {
                    return b.length() - a.length();
                } else {
                    return a.compareTo(b);
                }
            }
        });

        return String.join("/", result);
    }
}
