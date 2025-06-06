package AceptaElReto;

/*
5 10 20 40 7 3
3
1 2
2 5
4 1
0

0
47
-77
---
 */
public class AceptaElReto618 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        String[] niveles;
        do {
            niveles = sc.nextLine().split(" ");
            if (Integer.parseInt(niveles[0]) != 0) {
                int[] tamanos = new int[Integer.parseInt(niveles[0])];
                int[] posiciones = new int[Integer.parseInt(niveles[0]) + 1];
                
                posiciones[0] = 0;
                for (int i = 0; i < Integer.parseInt(niveles[0]); i++) {
                    tamanos[i] = Integer.parseInt(niveles[i + 1]);
                    posiciones[i + 1] = posiciones[i] + tamanos[i];
                }
                
                int casos = sc.nextInt();
                sc.nextLine();
                for (int i = 0; i < casos; i++) {
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    sc.nextLine();
                    int actual = posiciones[a];
                    int destino = posiciones[b - 1];
                    int desplazamiento = destino - actual;
                    
                    System.out.println(desplazamiento);
                }
                System.out.println("---");
            }
        } while (Integer.parseInt(niveles[0]) != 0);
    }
}
