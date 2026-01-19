package CodeWars;

import java.util.HashMap;

/**
 * a = [121, 144, 19, 161, 19, 144, 19, 11]
 * b = [121, 14641, 20736, 361, 25921, 361, 20736, 361]
 */

public class AreTheyTheSame {
    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null || a.length != b.length ) return false;

        HashMap<Integer, Integer> mapA = new HashMap<>();
        HashMap<Integer, Integer> mapB = new HashMap<>();
        for (int ai : a) {
            int square = ai * ai;
            mapA.put(square, mapA.getOrDefault(square, 0) + 1);
        }
        for (int bi : b) {
            mapB.put(bi, mapB.getOrDefault(bi, 0) + 1);
        }
        return mapA.equals(mapB);
    }


    public static void main(String[] args) {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};

        System.out.println(comp(a,b)? "TRUE":"FALSE");
    }
}
