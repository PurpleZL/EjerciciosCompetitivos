package AceptaElReto;

import java.util.Arrays;

/*
5
3524
1111
1121
6174
1893

3
8
5
0
7
 */
public class AceptaElReto100 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            int num = sc.nextInt();
            
            if (num != 6174) {
                int result = kaprekar(num);
                System.out.println((result > 0)? result:"8");
            } else {
                System.out.println("0");
            }
        }
    }

    private static int kaprekar(int num) {
        if (num == 6174) {
            return 0;
        }

        String n = String.format("%04d", num);
        boolean mismoDigito = n.replace(n.charAt(0)+"", "").length() == 0;

        if (mismoDigito || num == 0) {
            return -8;
        }

        char[] c = n.toCharArray();
        Arrays.sort(c);
        int min = Integer.parseInt(String.copyValueOf(c));
        
        int max =Integer.parseInt(new StringBuilder(new String(c)).reverse().toString());

        return 1 + kaprekar(max - min);
    }
}
