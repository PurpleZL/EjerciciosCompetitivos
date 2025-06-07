package AceptaElReto;

import java.util.HashSet;

/*
16 8
AAAAAAAIBBCCCBBC
AAIIIAAICBBCBBCC
AIIIAAIICCBBBCCC
IIIAAIIICCBBBCCC
IIAAIIAICBBCBBCC
IAAIIAAIBBCCCBBC
AAAAAAAIBBCCCBBC
IIIIIIIICCCCCCCC
0 0

SI
 */
public class AceptaElReto619 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int ancho;
        int largo;
        do {
            ancho = sc.nextInt();
            largo = sc.nextInt();
            if (ancho != 0 && largo != 0) {
                sc.nextLine();
                boolean zx = true;

                String[] imagen = new String[largo];
                for (int i = 0; i < largo; i++) {
                    imagen[i] = sc.nextLine();
                }

                for (int blockX = 0; blockX < ancho; blockX += 8) {
                    for (int blockY = 0; blockY < largo; blockY += 8) {
                        HashSet<Character> colores = new HashSet<>();

                        for (int y = blockY; y < blockY + 8; y++) {
                            for (int x = blockX; x < blockX + 8; x++) {
                                char color = imagen[y].charAt(x);
                                colores.add(color);

                                if (colores.size() > 2) {
                                    zx = false;
                                    break;
                                }
                            }
                            if (!zx) {
                                break;
                            }
                        }
                        if (!zx) {
                            break;
                        }
                    }
                    if (!zx) {
                        break;
                    }
                }
                System.out.println((zx) ? "SI" : "NO");
            }
        } while (ancho != 0 && largo != 0);
    }
}
