package AceptaElReto;

/*
5 4
*--**  012346
---*-  67891011
---**
***--
4 5
**-*
****
*--*
**-*
-***
0 0

0
3
 */
public class AceptaElReto176XXXXXXXXXXXXXXXXXXXXXXXX {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int anchura;
        int altura;
        String contenido;
        int contador = 0;
        int vacias;
        do {
            anchura = sc.nextInt();
            altura = sc.nextInt();
            sc.nextLine();
            if (anchura != 0 && altura != 0) {
            contenido = "";
            for (int i = 0; i < altura; i++) {
                contenido += sc.nextLine();
            }
            vacias = 0;
            for (int i = anchura; i < altura * anchura - anchura; i++) {
                if (i % anchura != 0 && i % anchura != anchura - 1) {
                    if (contenido.charAt(i) == '-') {
                        contador = 0;
                        if (contenido.charAt(i + 1) == '*') contador++;
                        if (contenido.charAt(i - 1) == '*') contador++;
                        if (contenido.charAt(i + anchura) == '*') contador++;
                        if (contenido.charAt(i + anchura + 1) == '*') contador++;
                        if (contenido.charAt(i + anchura - 1) == '*') contador++;
                        if (contenido.charAt(i - anchura) == '*') contador++;
                        if (contenido.charAt(i - anchura + 1) == '*') contador++;
                        if (contenido.charAt(i - anchura - 1) == '*') contador++;
                        if (contador >= 6) {
                        vacias++;
                    }
                }
            }
            
        }
            System.out.println(vacias);
        }
        }while (anchura != 0 && altura != 0);
}
}    
/*

**-
*-*
-**

 */
