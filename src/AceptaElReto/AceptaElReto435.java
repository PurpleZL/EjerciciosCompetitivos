package AceptaElReto;

import java.util.HashMap;
import java.util.Map;

/*
314159
9876543210
00112233554466779898

no subnormal
subnormal
subnormal
 */
public class AceptaElReto435 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        String entrada;
        int[] contadores = new int[10];
        boolean encontrado = false;
        int n;

        while (sc.hasNextLine()) {
            entrada = sc.nextLine();
            encontrado = false;

            for (int i = 0; i < contadores.length; i++) {
                contadores[i] = contarOcurrencias(entrada, i);
                if (i > 0) {
                    if (contadores[0] != contadores[i]) {
                        encontrado = true;
                    }
                }
            }

            if (encontrado) {
                System.out.println("no subnormal");
            } else {
                System.out.println("subnormal");
            }

        }
    }

    public static int contarOcurrencias(String s, int n) {
        int contador = 0;
        char c = Character.forDigit(n, 10);
        for (int i = 0; i < s.length(); i++) {
            if (c == s.charAt(i)) {
                contador++;
            }
        }
        return contador;
    }
}
//import java.util.HashMap;
//import java.util.Map;
//
//public class AceptaElReto435 {
//
//    static java.util.Scanner sc;
//
//    public static boolean casoDePrueba() {
//        if (!sc.hasNext()) {
//            return false;
//        } else {
//            String caso = sc.nextLine().trim();
//            if (!caso.isEmpty()) {
//                System.out.println(esSubnormal(caso.split("")) ? "subnormal" : "no subnormal");
//            }
//            return true;
//        }
//    } // casoDePrueba
//
//    public static void main(String[] args) {
//        sc = new java.util.Scanner(System.in);
//        while (casoDePrueba()) {
//        }
//    } // main
//
//    private static boolean esSubnormal(String[] digitos) {
//        HashMap<String, Integer> frecuencia = new HashMap<>();
//
//        for (int i = 0; i < 10; i++) {
//            frecuencia.put(String.valueOf(i), 0);
//        }
//
//        for (String digito : digitos) {
//            frecuencia.put(digito, frecuencia.get(digito) + 1);
//        }
//        Integer referencia = null;
//        for (Map.Entry<String, Integer> entry : frecuencia.entrySet()) {
//            if (entry.getValue() > 0) {
//                if (referencia == null) {
//                    referencia = entry.getValue();
//                } else if (!entry.getValue().equals(referencia)) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//}
