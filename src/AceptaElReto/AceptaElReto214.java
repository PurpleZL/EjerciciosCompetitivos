package AceptaElReto;

import java.util.HashMap;

/*
11
Felipe Carlos Felipe Felipe Felipe Carlos Felipe Carlos Alfonso Alfonso JuanCarlos
3
Felipe Leonor Felipe
12
Carlos Isabel Carlos Jorge Jorge Jorge Jorge Guillermo Victoria Jorge Jorge Isabel
3
Carlos Guillermo Jorge
0

6
1
7

3
2
7

 */
public class AceptaElReto214 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos = -1;
        String reyes;
        HashMap<String, Integer> orden;
        String[] array;
        do {
            casos = sc.nextInt();
            sc.nextLine();
            if (casos != 0) {
                reyes = sc.nextLine();
                array = reyes.split(" ");
                orden = new HashMap<>();
                for (String string : array) {
                    if (!orden.containsKey(string)) {
                        orden.put(string, 1);
                    } else {
                        orden.put(string, orden.get(string) + 1);
                    }
                }
                ///////////////////////////////////////////////////
                casos = sc.nextInt();
                sc.nextLine();
                reyes = sc.nextLine();
                array = reyes.split(" ");
                for (String string : array) {
                    if (!orden.containsKey(string)) {
                        orden.put(string, 1);
                        System.out.println(orden.get(string));
                    } else {
                        orden.put(string, orden.get(string) + 1);
                        System.out.println(orden.get(string));
                    }
                }
                 System.out.println("");
            }
        } while (casos != 0);
    }
}
