package AceptaElReto;

import java.util.Map;
import java.util.TreeMap;

/*
5
20 Dexter
35 The Wire
40 Dexter
20 Juego de Tronos
100 Black Mirror
4
45 aqui no hay quien viva
30 Erase una vez la vida
29 Stranger Things
15 Erase una vez la vida
0

Black Mirror
Dexter
The Wire
---
Erase una vez la vida
aqui no hay quien viva
---
 */
public class AceptaElReto700 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos;
        TreeMap<String, Integer> tree;
        TreeMap<Integer, String> orden;
        do {
            casos = sc.nextInt();
            sc.nextLine();
            if (casos != 0) {
                tree = new TreeMap();
                for (int i = 0; i < casos; i++) {
                    String input = sc.nextLine();
                    int num = Integer.parseInt(input.substring(0, input.indexOf(" ")));
                    String titulo = input.substring(input.indexOf(" ") + 1);
                    if (tree.containsKey(titulo)) {
                        tree.put(titulo, tree.get(titulo) + num);
                    } else {
                        tree.put(titulo, num);
                    }
                }
                orden= new TreeMap<>();
                for (Map.Entry<String, Integer> entry : tree.entrySet()) {
                    if (entry.getValue() >= 30) {
                        if (orden.containsKey(-entry.getValue())) {// aqui falla con mas de 2 pelis con misma puntuacion
                            orden.put(-entry.getValue()+1, entry.getKey());
                        }else orden.put(-entry.getValue(), entry.getKey());
                    }
                }
                int contador=0;
                for (Map.Entry<Integer, String> entry : orden.entrySet()) {
                    System.out.println(entry.getValue());
                    if (++contador==3)break; 
                }
                System.out.println("---");
            }
        } while (casos != 0);
    }
}
