package AceptaElReto;

/*
4
100 -10
-10 -100
-10 100
100 -1000

SI
NO
SI
NO
 */
public class AceptaElReto313 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos=sc.nextInt();
        int gasto1=0;
        int gasto2=0;
        
        for (int i = 0; i < casos; i++) {
            gasto1=sc.nextInt();
            gasto2=sc.nextInt();
            if (gasto1+gasto2>=0) {
                System.out.println("SI");
            }else System.out.println("NO");
        }
    }
}
