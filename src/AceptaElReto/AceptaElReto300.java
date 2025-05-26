package AceptaElReto;

import java.util.ArrayList;
import java.util.Arrays;

/*
4
albaricoque
seculariza
peliagudo
abracadabra

SI
NO
SI
NO
 */
public class AceptaElReto300 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        int casos;
        String palabra;
        
        casos = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < casos; i++) {
            palabra = sc.nextLine();
            System.out.println(pentavocal(palabra) ? "SI" : "NO");
        }
    }

    private static boolean pentavocal(String palabra) {
        ArrayList<Character> vocales = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            vocales.remove((Character) c); //recuerda que hay que especificar que lo consideramos como un caracter
        }
        return vocales.isEmpty();
    }
}
