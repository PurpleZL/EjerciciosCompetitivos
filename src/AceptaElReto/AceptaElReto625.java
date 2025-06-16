package AceptaElReto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
2
5
1 2 2 1 2
3
1 1 10

6
NO HAY NINGUNO
 */

public class AceptaElReto625 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    
    public static void main(String[] args) {
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            int tiras = sc.nextInt();
            List<Integer> longitudes = new ArrayList<>();
            for (int j = 0; j < tiras; j++) {
                longitudes.add(sc.nextInt());
            }
            Collections.sort(longitudes, Collections.reverseOrder());
            
            int perimetro = 0;
            // a < b + c
            for (int k = 0; k < longitudes.size() - 2; k++) {
                int a = longitudes.get(k);
                int b = longitudes.get(k + 1);
                int c = longitudes.get(k + 2);
                if (b + c > a) {
                    perimetro = a + b + c;
                    break;
                }
            }
            
            if (perimetro == 0) {
                System.out.println("NO HAY NINGUNO");
            } else {
                System.out.println(perimetro);
            }
        }
    }
}
