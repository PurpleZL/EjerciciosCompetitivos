package AceptaElReto;

import java.util.ArrayList;

/*
1 1
---
|*|
---
3 2
-----
| * |
|* *|
-----
0 0

---
|*|
---
----
| *|
|* |
| *|
----
 */
public class AceptaElReto795 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int ancho;
        int alto;
        while (true) {
            ancho = sc.nextInt();
            alto = sc.nextInt();
            if (ancho == 0 && alto == 0) {
                break;
            }
            sc.nextLine();
            sc.nextLine();
            ArrayList<String> lineas = new ArrayList<>();
            for (int i = 0; i < alto; i++) {
                String linea = sc.nextLine();
                lineas.add(linea.substring(1, linea.length() - 1));
            }
            sc.nextLine();
            if (ancho == 0) {
                System.out.println("");
                continue;
            }
            if (alto == 0) {
                System.out.println("");
                continue;
            }
            StringBuilder sb = new StringBuilder();

            sb.append(repetirCaracter('-', alto + 2)).append("\n");
            for (int i = ancho - 1; i >= 0; i--) {
                sb.append("|");
                for (int j = 0; j < alto; j++) {
                    sb.append(lineas.get(j).charAt(i));
                }
                sb.append("|\n");
            }
            sb.append(repetirCaracter('-', alto + 2)).append("\n");

            System.out.print(sb.toString());
        }
    }

    private static String repetirCaracter(char c, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(c);
        }
        return sb.toString();
    }
}
