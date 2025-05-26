package CodeWars;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*
With input 'a':
Your function should return: ['a']

With input 'ab':
Your function should return ['ab', 'ba']

With input 'abc':
Your function should return ['abc','acb','bac','bca','cab','cba']

With input 'aabb':
Your function should return ['aabb', 'abab', 'abba', 'baab', 'baba', 'bbaa']
 */
public class SoManyPermutations {

    public static void main(String[] args) {
        System.out.println(singlePermutations("aabb"));
    }

    public static List<String> singlePermutations(String s) {
        Set<String> permutations = new HashSet<>();
        permute(s, "", permutations);
        return new ArrayList<>(permutations);
    }


    private static void permute(String remaining, String current, Set<String> permutations) {
        if (remaining.isEmpty()) {
            permutations.add(current);
            return;
        }
        for (int i = 0; i < remaining.length(); i++) {
            char ch = remaining.charAt(i);
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
            permute(newRemaining, current + ch, permutations);
        }
    }
}
/*
permute("abc", ""):
    -> permute("bc", "a"):
        -> permute("c", "ab"):
            -> permute("", "abc") -> resultado: "abc"
        -> permute("b", "ac"):
            -> permute("", "acb") -> resultado: "acb"
    -> permute("ac", "b"):
        -> permute("c", "ba"):
            -> permute("", "bac") -> resultado: "bac"
        -> permute("a", "bc"):
            -> permute("", "bca") -> resultado: "bca"
    -> permute("ab", "c"):
        -> permute("b", "ca"):
            -> permute("", "cab") -> resultado: "cab"
        -> permute("a", "cb"):
            -> permute("", "cba") -> resultado: "cba"

*/