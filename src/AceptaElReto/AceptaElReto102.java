package AceptaElReto;

import java.util.ArrayList;

/*
pEsta cadena esta sin codificar
pfin
qbfjpvBFJPV
ozdhntZDHNT
xXzwoziui-Um
qGJO

12
1
10
10
4
 */
public class AceptaElReto102 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Character> codificado;
        String cadena;
        String decodificado;
        int cesar;
        int vocales;
        do {
            cadena = sc.nextLine();
            codificado = new ArrayList();
            decodificado = "";
            for (int i = 1; i < cadena.toCharArray().length; i++) {
                codificado.add(cadena.toCharArray()[i]);
            }

            if(!Character.isLetter(cadena.charAt(0))){
                cesar=0;
            }else if (Character.isUpperCase(cadena.charAt(0))) {
                cesar = 'P' - cadena.charAt(0);
            }else cesar = 'p' - cadena.charAt(0);

            for (int i = 0; i < codificado.size(); i++) {
                if (!Character.isLetter(codificado.get(i))) {
                    decodificado += "" + codificado.get(i);
                    continue;
                }
                if (Character.isUpperCase(codificado.get(i))) {
                    codificado.set(i, (char) ('A' + (codificado.get(i) - 'A' + cesar + 26) % 26));
                    decodificado += "" + codificado.get(i);
                } else {
                    codificado.set(i, (char) ('a' + (codificado.get(i) - 'a' + cesar + 26) % 26));
                    decodificado += "" + codificado.get(i);
                }
            }

            if (!decodificado.equals("FIN")) {
                vocales = 0;
                for (Character c : codificado) {
                    if ("aeiouAEIOU".indexOf(c) != -1) {
                        vocales++;
                    }
                }
                System.out.println(vocales);
            }
        } while (!decodificado.equals("FIN"));
    }
}
