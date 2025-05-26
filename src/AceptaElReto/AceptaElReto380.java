package AceptaElReto;

/*
4
100 200 100 200
2
50 25
0

600
75
 */
public class AceptaElReto380 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos=-1;
        int gastos;
        do {
            casos=sc.nextInt();
            if (casos!=0) {
                int total=0;
                for (int i = 0; i < casos; i++) {
                   gastos=sc.nextInt();
                   total+=gastos;
                }
                System.out.println(total);
            }
        } while (casos!=0);
    }
}
