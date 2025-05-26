package AceptaElReto;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/*
4
Guerra tenia una parra y Parra tenia una perra
la perra de Parra rompio la parra de Guerra y Guerra aporreo con la porra a la perra
Si la perra de Parra no hubiera roto la parra de Guerra
este no hubiera aporreado con la porra a la perra de Parra
0

aporreado 4
aporreo 2
con 2 4
este 4
guerra 1 2 3
hubiera 3 4
parra 1 2 3 4
perra 1 2 3 4
porra 2 4
rompio 2
roto 3
tenia 1
una 1
----
 */
public class AceptaElReto291 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos = -1;
        TreeMap<String, TreeSet<Integer>> lista;
        String frase;
        String[] array;
        do {
            casos = sc.nextInt();
            sc.nextLine();
            if (casos != 0) {
                lista = new TreeMap<>();
                for (int i = 1; i <= casos; i++) {
                    frase = sc.nextLine();
                    array = frase.split(" ");
                    for (String string : array) {
                        if (string.length() > 2) {
                            if (!lista.containsKey(string.toLowerCase())) {
                                lista.put(string.toLowerCase(), new TreeSet<Integer>());
                            } 
                            lista.get(string.toLowerCase()).add(i);
                        }
                    }
                }
                for (Map.Entry<String, TreeSet<Integer>> entry : lista.entrySet()) {
                    String nums = "";
                    for (Integer integer : entry.getValue()) {
                        nums += integer + " ";
                    }
                    System.out.println(entry.getKey() + " " + nums.trim());
                }
                System.out.println("---");
            }
        } while (casos != 0);
    }
}
