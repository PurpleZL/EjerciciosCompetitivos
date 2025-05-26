package AceptaElReto;

import java.util.ArrayList;
import java.util.HashMap;

/*
2
AdaByron
adabyron
4
camelcase
concursoDeProgramacion
CamelCase
camelCase

AdaByron
AdaByron
---
CamelCase
concursoDeProgramacion
CamelCase
CamelCase
---
 */
public class AceptaElReto558 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        while (sc.hasNextInt()) {
            int casos = sc.nextInt();
            sc.nextLine();
            ArrayList<String> lista = new ArrayList<>();
            HashMap<String, String> map = new HashMap<>();

            for (int i = 0; i < casos; i++) {
                String camel = sc.nextLine();
                lista.add(camel);
                String lowerCamel = camel.toLowerCase();

                if (!map.containsKey(lowerCamel) || contarMayusc(camel) > contarMayusc(map.get(lowerCamel))) {
                    map.put(lowerCamel, camel);
                }
            }

            for (String string : lista) {
                System.out.println(map.get(string.toLowerCase()));
            }
            System.out.println("---");
        }
    }

    private static int contarMayusc(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        return count;
    }
}
