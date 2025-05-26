package AceptaElReto;

/*
2
supercalifragilisticoespialidoso
Mary

osodilaipseocitsiligarfilacrepus
Yram
 */
public class AceptaElReto372 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        int casos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < casos; i++) {
            String palabra = sc.nextLine();
            System.out.println(invertirPalabra(palabra));
        }
    }

    private static String invertirPalabra(String palabra) {
        StringBuilder reverso = new StringBuilder();
        for (int i = palabra.length() - 1; i >= 0; i--) {
            reverso.append(Character.toLowerCase(palabra.charAt(i)));
        }

        if (Character.isUpperCase(palabra.charAt(0))) {
            reverso.setCharAt(0, Character.toUpperCase(reverso.charAt(0)));
        }

        return reverso.toString();
    }
}

//public class AceptaElReto372 {
//
//    static java.util.Scanner sc = new java.util.Scanner(System.in);
//
//    public static void main(String[] args) {
//        int casos;
//        String comprobar;
//        char[] palabra;
//        String reverso;
//
//        casos = sc.nextInt();
//        sc.nextLine();
//        for (int i = 0; i < casos; i++) {
//            comprobar = sc.nextLine();
//            
//            if (Character.isUpperCase(comprobar.charAt(0))) {
//                palabra = comprobar.toLowerCase().toCharArray();
//                reverso = "";
//                for (int j = palabra.length - 1; j >= 0; j--) {
//                    if (j != palabra.length - 1) {
//                        reverso += palabra[j];
//                    } else {
//                        reverso += (char) (palabra[j] - 32);
//                    }
//                }
//            } else {
//                palabra = comprobar.toLowerCase().toCharArray();
//                reverso = "";
//                for (int j = palabra.length - 1; j >= 0; j--) {
//                    reverso += palabra[j];
//                }
//            }
//            System.out.println(reverso);
//        }
//    }
//}