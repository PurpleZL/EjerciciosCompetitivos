package AceptaElReto;

import java.util.Arrays;

/*
4
43 40 41 42
6
22 22 20 25 26 27
0

1
3
 */
public class AceptaElReto534 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        int casos;
        do {
            casos = sc.nextInt();
            if (casos != 0) {
                int[] nums = new int[casos];
                for (int i = 0; i < casos; i++) {
                    nums[i] = sc.nextInt();
                }
                Arrays.sort(nums);
                int dif = 0;
                int temp;
                for (int i = casos-1; i >= 0; i-=2) {
                    temp = nums[i]-nums[i-1];
                    if (temp > dif) {
                        dif = temp;
                    }
                }
                System.out.println(dif);
            }
        } while (casos != 0);
    }
}
