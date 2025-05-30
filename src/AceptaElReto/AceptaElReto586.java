package AceptaElReto;

import java.util.TreeSet;

/*
3
2
1950 1952
2
1950 1951
3
1970 1960 1965

1
0
8
 */
public class AceptaElReto586 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            int n = sc.nextInt();
            TreeSet<Integer> ts = new TreeSet<Integer>();
            for (int j = 0; j < n; j++) {
               ts.add(sc.nextInt());
            }
            System.out.println(ts.last() - ts.first() + 1 - ts.size());
        }
    }
}
