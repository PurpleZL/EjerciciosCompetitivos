package CodeWars;


import java.util.ArrayList;
import java.util.List;

public class Isograms {
    public static void main(String[] args) {
        System.out.println(isIsogram("isIsogram"));
    }
    public static boolean  isIsogram(String str) {
        char[] array = str.toCharArray();
        List<Character> l = new ArrayList<>();
        for (char c : array) {
            if (!l.contains(Character.toLowerCase(c))){
                l.add(Character.toLowerCase(c));
            }else{
                return false;
            }
        }
        return true;
    }
}
