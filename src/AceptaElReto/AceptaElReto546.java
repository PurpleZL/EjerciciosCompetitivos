package AceptaElReto;

import java.util.*;
/*
2
4
2 1 2 3
5
3 3 4 4 5
3
1 2 3
5
6 6 4 4 5

2
4
Nada que intercambiar
4 6
 */

public class AceptaElReto546 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int casos = Integer.parseInt(sc.nextLine());

        for (int c = 0; c < casos; c++) {
            int n = Integer.parseInt(sc.nextLine());
            int[] alejandro = leerCromos(n);
            int m = Integer.parseInt(sc.nextLine());
            int[] mateo = leerCromos(m);
            
            Set<Integer> unicosAlejandro = new HashSet<>();
            Set<Integer> repetidosAlejandro = new HashSet<>();
            contarRepetidos(alejandro, unicosAlejandro, repetidosAlejandro);

            Set<Integer> unicosMateo = new HashSet<>();
            Set<Integer> repetidosMateo = new HashSet<>();
            contarRepetidos(mateo, unicosMateo, repetidosMateo);

            TreeSet<Integer> intercambioA = new TreeSet<>();
            for (int cromo : repetidosAlejandro) {
                if (!unicosMateo.contains(cromo)) intercambioA.add(cromo);
            }

            TreeSet<Integer> intercambioM = new TreeSet<>();
            for (int cromo : repetidosMateo) {
                if (!unicosAlejandro.contains(cromo)) intercambioM.add(cromo);
            }

            imprimir(intercambioA);
            imprimir(intercambioM);
        }
    }

    static int[] leerCromos(int cantidad) {
        String[] partes = sc.nextLine().split(" ");
        int[] cromos = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            cromos[i] = Integer.parseInt(partes[i]);
        }
        return cromos;
    }

    static void contarRepetidos(int[] cromos, Set<Integer> unicos, Set<Integer> repetidos) {
        for (int cromo : cromos) {
            if (!unicos.add(cromo)) {
                repetidos.add(cromo);
            }
        }
    }

    static void imprimir(Set<Integer> conjunto) {
        if (conjunto.isEmpty()) {
            System.out.println("Nada que intercambiar");
        } else {
            StringBuilder sb = new StringBuilder();
            for (int num : conjunto) sb.append(num).append(" ");
            System.out.println(sb.toString().trim());
        }
    }
}
