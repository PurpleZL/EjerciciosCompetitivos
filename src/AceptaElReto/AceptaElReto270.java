package AceptaElReto;

import java.util.Map;
import java.util.TreeMap;

/*
2
Laureano
INCORRECTO
Aldonza
CORRECTO
3
Aldonza
CORRECTO
Aldonza
INCORRECTO
Laureano
CORRECTO
1
Aldonza Lorenzo
CORRECTO
0

Aldonza, 1
Laureano, -1
---
Laureano, 1
---
Aldonza Lorenzo, 1
---
 */
public class AceptaElReto270 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        int casos;
        String nombre;
        int resultado;
        TreeMap<String, Integer> orden;
        do {
            casos = sc.nextInt();
            sc.nextLine();
            if (casos != 0) {
                orden = new TreeMap();
                for (int i = 0; i < casos; i++) {
                    nombre = sc.nextLine();
                    resultado = (sc.nextLine().equals("CORRECTO"))? 1:-1;
                    if (!orden.containsKey(nombre)) {
                        orden.put(nombre, resultado);
                    }else{
                        orden.put(nombre, orden.get(nombre)+resultado);
                    }
                }
                for (Map.Entry<String, Integer> entry : orden.entrySet()) {
                    if (entry.getValue() != 0) {
                        System.out.printf("%s, %d\n", entry.getKey(), entry.getValue());
                    }
                }
                System.out.println("---");
            }
        } while (casos != 0);
    }
}
