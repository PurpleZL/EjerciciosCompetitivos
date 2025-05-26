package AceptaElReto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
3
1
1
3
3
2
2 2 2
5
4
2 2 1 2 1

6
10
16
 */
public class AceptaElReto365 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        int casos;
        int ninios;
        int posicion;
        List<String> regalos;
        int minutos;
        
        casos=sc.nextInt();
        for (int i = 0; i < casos; i++) {
            ninios = sc.nextInt();
            posicion = sc.nextInt();
            sc.nextLine();
            regalos = new ArrayList<>(Arrays.asList(sc.nextLine().split(" ")));
            minutos = 0;
            int reps = Integer.parseInt(regalos.get(posicion-1));
            for (int j = 0; j < reps; j++) {
                for (int k = 0; k < ninios; k++) {
                    int numRegalos = Integer.parseInt(regalos.get(k));
                    if (numRegalos != 0 ) {
                        minutos+=2;
                        regalos.set(k, Integer.toString(numRegalos-1));
                    }
                    if (Integer.parseInt(regalos.get(posicion-1))==0) {
                        break;
                    }
                }
            }
            
            System.out.println(minutos);
        }
    }
}
