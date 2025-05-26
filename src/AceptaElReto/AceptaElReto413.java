package AceptaElReto;

/*
3
1 3
4 4
2 6

2 1
8 8
6 6
 */
public class AceptaElReto413 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos = sc.nextInt();

        for (int i = 0; i < casos; i++) {
            int ancho = sc.nextInt();
            int alto = sc.nextInt();
            if (ancho*alto%2==0) {
                System.out.println(ancho*alto/2+" "+ancho*alto/2);

            }else {
                System.out.println((ancho*alto+1)/2+" "+(ancho*alto-1)/2);
            }
        }
    }
}
