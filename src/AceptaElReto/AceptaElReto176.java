package AceptaElReto;

/*
5 4
*--**
---*-
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
public class AceptaElReto176 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int anchura;
        int altura;
        do {
            anchura = sc.nextInt();
            altura = sc.nextInt();
            if (anchura != 0 && altura != 0) {
                sc.nextLine();
                char[] linea;
                char[][] minas = new char[altura][anchura];
                for (int i = 0; i < altura; i++) {
                    linea = sc.nextLine().toCharArray();
                    for (int j = 0; j < anchura; j++) {
                        minas[i][j] = linea[j];
                    }
                }
                int rodeados = 0;
                for (int i = 0; i < altura; i++) {
                    for (int j = 0; j < anchura; j++) {
                        if (minas[i][j] == '-') {
                            int contadorAsteriscos = 0;
                            for (int di = -1; di <= 1; di++) {
                                for (int dj = -1; dj <= 1; dj++) {
                                    if (di == 0 && dj == 0) {
                                        continue;
                                    }
                                    int ni = i + di;
                                    int nj = j + dj;
                                    if (ni >= 0 && ni < altura && nj >= 0 && nj < anchura) {
                                        if (minas[ni][nj] == '*') {
                                            contadorAsteriscos++;
                                        }
                                    }
                                }
                            }
                            if (contadorAsteriscos >= 6) {
                                rodeados++;
                            }
                        }
                    }
                }
                System.out.println(rodeados);
            }
        } while (anchura != 0 && altura != 0);
    }
}
