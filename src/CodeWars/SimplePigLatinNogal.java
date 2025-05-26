package CodeWars;

/*
pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
pigIt('Hello world !');     // elloHay orldway !
 */
public class SimplePigLatinNogal {

    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool"));
        System.out.println(pigIt("Hello world !"));
    }

    public static String pigIt(String str) {
        String[] palabras = str.split(" ");
        String salida = "";
        for (int i = 0; i < palabras.length; i++) {
            if (!palabras[i].equals("!")&&!palabras[i].equals("?")) {
                salida += palabras[i].substring(1) + palabras[i].charAt(0) + "ay";

            } else {
                salida += palabras[i];
            }
            if (i < palabras.length - 1) {
                salida += " ";
            }
        }

        return salida;
    }
}
