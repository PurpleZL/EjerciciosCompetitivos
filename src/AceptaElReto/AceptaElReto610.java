package AceptaElReto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
3
2 1 2 1
2 2 1 1
5 1 5 2
 
No quiero irme, Sr. Stark!
No quiero irme, Peter!
No hay abrazo
*/
public class AceptaElReto610 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        int casos = sc.nextInt();

        for (int c = 0; c < casos; c++) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int p = sc.nextInt();    
            int k = sc.nextInt();     

            List<Integer> personas = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                personas.add(i);
            }
            int eliminaciones = n / 2 + (n % 2);
            int index = 0;
            Set<Integer> muertos = new HashSet<>();
            for (int i = 0; i < eliminaciones; i++) {
                index = (index + k) % personas.size();
                int eliminado = personas.remove(index);
                muertos.add(eliminado);
            }

            boolean ironMuere = muertos.contains(s);
            boolean spiderMuere = muertos.contains(p);

            if (ironMuere && spiderMuere) {
                System.out.println("No hay abrazo");
            } else if (spiderMuere) {
                System.out.println("No quiero irme, Sr. Stark!");
            } else if (ironMuere) {
                System.out.println("No quiero irme, Peter!");
            } else {
                System.out.println("No hay abrazo");
            }
        }
    }
}
