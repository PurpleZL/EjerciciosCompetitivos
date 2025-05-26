package AceptaElReto;

import java.util.HashMap;
import java.util.Map;

/*
5
7
15
23
77
18000
0

NO
NO
NO
SI
SI
NO
 */
public class AceptaElReto192 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    static Map<Integer, Boolean> memo = new HashMap<>();

    public static void main(String[] args) {
        
        int num;
        do {
            num = sc.nextInt();
            if (num != 0) {
                if (esGenerable(num)) {
                    System.out.println("SI");
                }else System.out.println("NO");
            }
        } while (num != 0);
    }

    public static boolean esGenerable(int num) {
        if (num == 1) return true;
        if (num < 1) return false;
        if (memo.containsKey(num)) return memo.get(num);

        boolean resultado = false;        
        if (num % 3 == 0) {
            resultado = esGenerable(num / 3);
        }
        if (!resultado && num >= 6) {
            resultado = esGenerable(num - 5);
        }

        memo.put(num, resultado);
        return resultado;
    }
}
