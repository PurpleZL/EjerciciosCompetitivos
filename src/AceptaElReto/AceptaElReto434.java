package AceptaElReto;

/*
2
2 5
5 2

ROMANCE
PRINCIPIO
 */
public class AceptaElReto434 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos=sc.nextInt();
        for (int i = 0; i < casos; i++) {
            int num=sc.nextInt();
            int cajas=sc.nextInt();
            if (num<=cajas) {
                System.out.println("ROMANCE");
            }else System.out.println("PRINCIPIO");
        }
    }
}
