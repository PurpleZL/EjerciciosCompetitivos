package AceptaElReto;

import java.util.ArrayList;

/*
4
4 10 3 2
4
10 3 2 4
5
4 10 10 3 2
0

1
1
0
 */
public class AceptaElReto376 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        int numDatos;
        ArrayList<Integer> alturas;
        int picos;
        do {
            numDatos = sc.nextInt();
            sc.nextLine();
            if (numDatos != 0) {
                String[] partes = sc.nextLine().split(" ");
                alturas = new ArrayList<>();
                for (String parte : partes) {
                    alturas.add(Integer.valueOf(parte));
                }
                alturas.add(0, alturas.get(alturas.size() - 1));
                alturas.add(alturas.get(1));
                picos = 0;
                for (int i = 1; i < alturas.size()-1; i++) {
                    if (alturas.get(i) > alturas.get(i-1) && alturas.get(i) > alturas.get(i+1)) {
                        picos++;
                    }
                }
                System.out.println(picos);
                
            }
        } while (numDatos != 0);
    }
}
