package AceptaElReto;

import java.util.Map;
import java.util.TreeMap;

/*
11
1 2 2 3 3 3 4 4 4 4 5
17
1 8 9 6 3 2 1 5 4 7 9 6 3 2 1 4 7
0

4
1
 */
public class AceptaElReto152 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        int casos=-1;
        int num;
        TreeMap <Integer, Integer> map;
        while ((casos=sc.nextInt()) != 0) {            
            map = new TreeMap();
            for (int i = 0; i < casos; i++) {
                num = sc.nextInt();  
                if (map.containsKey(num)) {
                    map.put(num, map.get(num)+1);
                }else map.put(num, 1);
            }
            int moda=0;
            int max=0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue()>max) {
                    moda=entry.getKey();
                    max=entry.getValue();
                }
            }
            System.out.println(moda);
        }
    }
}
