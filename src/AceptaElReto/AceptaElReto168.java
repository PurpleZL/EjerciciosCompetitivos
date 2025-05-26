package AceptaElReto;

import java.util.TreeSet;

/*
10
1 2 3 5 6 7 8 9 10
8
6 4 3 2 1 8 7
0

4
5
 */
public class AceptaElReto168 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        int casos;
        int nums;
        TreeSet array;
        do {
            casos=sc.nextInt();
            if (casos != 0) {
                array = new TreeSet();
                for (int i = 1; i < casos; i++) {
                    nums=sc.nextInt();
                    array.add(nums);
                }
                for (int i = 1; i < casos+1; i++) {
                    if (!array.contains(i)) {
                        System.out.println(i);
                        break;
                    }
                }
            }
        } while (casos != 0);
    }
}
