package CodeWars;

import java.util.TreeMap;

/**
 * Example: n = 86240 should return "(2**5)(5)(7**2)(11)"
 */

public class PrimesInNumbers {
    public static String factors(int n) {
        StringBuilder sb = new StringBuilder();
        TreeMap<Integer, Integer> facts = new TreeMap<>();

        int m = n;
        int d = 2;
        do {
             if (m % d == 0){
                 m /= d;
                 facts.merge(d, 1, Integer::sum);
             }else d++;
        }while(d*d <= m);

        if (m > 1) facts.put(m,1);
        formated(sb, facts);
        return sb.toString();
    }

    private static void formated(StringBuilder sb, TreeMap<Integer, Integer> facts) {
        for (Integer i : facts.keySet()) {
            int pow = facts.get(i);
            if (pow == 1){
                sb.append("("+i+")");
            }else sb.append("("+i+"**"+pow+")");
        }
    }

    public static void main(String[] args) {
        System.out.println(factors(7919));
    }
}
