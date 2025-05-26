package AceptaElReto;

/*
2
4 6 20
7 5 50

1
2
 */
public class AceptaElReto456 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos=sc.nextInt();
        for (int i = 0; i < casos; i++) {
            int ancho=sc.nextInt();
            int alto=sc.nextInt();
            int objetivo=sc.nextInt();
            int total=ancho*alto;
            if (objetivo/total==0) {
                System.out.println(1);
            }else if (objetivo%total!=0) {
                System.out.println(objetivo/total+1);
            }else System.out.println(objetivo/total);
        }
    }
}
