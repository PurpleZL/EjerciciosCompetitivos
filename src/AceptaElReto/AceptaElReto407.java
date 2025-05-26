package AceptaElReto;

/*
100 99 1
100 99 2
900 800 300
0 0 0

100
99
700
 */
public class AceptaElReto407 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int meta;
        int posicion;
        int dado;
        do {
            meta=sc.nextInt();
            posicion=sc.nextInt();
            dado=sc.nextInt();
            if (meta!=0&&posicion!=0&&dado!=0) {
                if (posicion+dado==meta) {
                    System.out.println(meta);
                }else if(posicion+dado>meta){
                    System.out.println(meta-(posicion+dado-meta));
                }else   System.out.println(posicion+dado);
            }
        } while (meta!=0&&posicion!=0&&dado!=0);
    }
}
