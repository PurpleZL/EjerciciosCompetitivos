package CodeWars;

import java.util.HashMap;
import java.util.LinkedList;

public class DeleteOccurrences {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        LinkedList<Integer> ll = new LinkedList<>();
        for (int n : elements) {
            int count = hm.getOrDefault(n, 0);
            if (count < maxOccurrences) {
                ll.add(n);
                hm.put(n, count + 1);
            }
        }
        return ll.stream().mapToInt(Integer::intValue).toArray();
    }
}
