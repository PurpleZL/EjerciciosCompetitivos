/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AceptaElReto;

import java.util.ArrayList;
import java.util.Arrays;

/*
3
Mi mama me mima
Ramses amaba a Nefertari
Egipto depende del Nilo para beber

3
9
12

Cada pictograma se corresponde con una sílaba del texto. 
1. Una sílaba es una consonante seguida de una vocal, seguida, opcionalmente, de otra consonante
2. Las palabras pueden empezar en vocal, que se considerará una sílaba en sí misma. 
3. La letra y no se considera vocal. 
 */
public class AceptaElReto660 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos = sc.nextInt();
        sc.nextLine();
        ArrayList<String> silabas = new ArrayList();
        for (int i = 0; i < casos; i++) {
            String[] palabra = sc.nextLine().split(" ");
            for (String pal : palabra) {
                for (String sil : averiguarSilaba(pal)) {
                    if (!silabas.contains(sil)) {//verificar que la silaba no este en el array
                        silabas.add(sil);
                    }
                }
            }
            System.out.println(silabas.size());//devolveremos el tamaño de la lista
            silabas.clear();
        }
    }

    public static String[] averiguarSilaba(String palabra) { //implementar sacar silabas
        ArrayList<Character> vocales = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        palabra = palabra.toLowerCase();
        StringBuilder silabas = new StringBuilder();
        for (int i = 0; i < palabra.length(); i++) {

            //excepcion de caracter suelto
            if (palabra.length() == 1) {
                silabas.append(palabra.charAt(i)).append(" ");
                continue;
            }

            //palabra que empieza por vocal
            if (i == 0 && vocales.contains(palabra.charAt(i))) {
                silabas.append(palabra.charAt(i)).append(" ");
                continue;
            }

            if (i + 1 <= palabra.length()) {
                //tamaño superior a 3? y la posicion 3 es una consonante
                if (i + 2 < palabra.length()) {
                    //la posicion 4 contiene vocal?
                    if (i + 3 < palabra.length() && vocales.contains(palabra.charAt(i + 3))) {
                        silabas.append(palabra.charAt(i))
                                .append(palabra.charAt(i + 1))
                                .append(" ");
                        i++;
                        continue;
                    }
                    silabas.append(palabra.charAt(i))
                            .append(palabra.charAt(i + 1))
                            .append(palabra.charAt(i + 2))
                            .append(" ");
                    i += 2;

                } else {//tamaño igual a 2
                    silabas.append(palabra.charAt(i))
                            .append(palabra.charAt(i + 1))
                            .append(" ");
                    i++;
                }
            }
        }
        return silabas.toString().split(" ");
    }
}
