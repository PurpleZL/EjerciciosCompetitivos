package AceptaElReto;

import java.util.ArrayList;
import java.util.TreeMap;

/*
2
2 GOTO 5
5 GOSUB 50
50 RETURN
0
10 GOSUB 50
11 GOTO 10
50 RETURN
0

10 GOTO 20
20 GOSUB 30
30 RETURN
---
10 GOSUB 30
20 GOTO 10
30 RETURN
---
 */
public class AceptaElReto418 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < casos; i++) {
            String[] datos;
            TreeMap<Integer, Integer> mapConversion = new TreeMap<>();
            ArrayList<String> listString = new ArrayList();
            String input;
            int linea = 0;
            do {
                input = sc.nextLine();
                if (!input.equals("0")) {
                    datos = input.split(" ");
                    listString.add(input);
                    mapConversion.put(Integer.valueOf(datos[0]), linea += 10);
                }
            } while (!input.equals("0"));
            for (String string : listString) {
                datos=string.split(" ");
                if (datos.length==3) {
                    System.out.println(mapConversion.get(Integer.valueOf(datos[0]))+" "+datos[1]+" "+mapConversion.get(Integer.valueOf(datos[2])));
                }else System.out.println(mapConversion.get(Integer.valueOf(datos[0]))+" "+datos[1]);
            }
            System.out.println("---");
        }
    }
}
