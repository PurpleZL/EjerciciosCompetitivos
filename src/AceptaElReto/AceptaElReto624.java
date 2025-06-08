package AceptaElReto;

import java.util.HashSet;

/*
4
1 1 2 2
4
1 2 2 1
6
1 2 1 1 1 2
0

1
2
2
 */
public class AceptaElReto624 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        int casos;
        do {
            casos = sc.nextInt();
            if (casos != 0) {
                int max = 0;
                HashSet<Integer> hs = new HashSet();
                for (int i = 0; i < casos; i++) {
                   int n = sc.nextInt();
                    if (!hs.add(n)) {
                        hs.remove(n);
                    }
                    if (max < hs.size()) {
                        max = hs.size();
                    }
                }
                System.out.println(max);
            }
        } while (casos != 0);
    }
}
