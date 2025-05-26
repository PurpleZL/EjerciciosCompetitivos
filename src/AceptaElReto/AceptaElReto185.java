package AceptaElReto;


/*
SI: patata maiz tomate FIN
NO: patata puerro guisantes pollo FIN
SI: tomate zanahoria puerro pollo calabacin arroz FIN
2
SI: tomate zanahoria pollo calabacin arroz FIN
NO: tomate ternera puerro FIN
0

guisantes
puerro ternera
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class AceptaElReto185 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int casos;
        do {
            casos = sc.nextInt();
            sc.nextLine();
            if (casos != 0) {
                String input;
                HashSet<String> listSi = new HashSet<>();
                HashSet<String> listNo = new HashSet<>();
                for (int i = 0; i < casos; i++) {
                    input = sc.nextLine();
                    String[] ingredientesArray = input.substring(4, input.length() - 3).split(" ");
                    if (input.startsWith("SI")) {
                        for (String ingrediente : ingredientesArray) {
                            listSi.add(ingrediente);
                        }
                    } else if (input.startsWith("NO")) {
                        for (String ingrediente : ingredientesArray) {
                            listNo.add(ingrediente);
                        }
                    }
                }
                listNo.removeAll(listSi);
                ArrayList<String> lista = new ArrayList<>(listNo);
                Collections.sort(lista);
                String texto="";
                for (String ingrediente : lista) {
                    texto+= ingrediente +" ";
                }
                System.out.println(texto.trim());
            }
        } while (casos != 0);
    }
}

