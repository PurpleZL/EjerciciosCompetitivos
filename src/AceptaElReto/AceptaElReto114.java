package AceptaElReto;

public class AceptaElReto114 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        int casos, numero;
        int [] posiblesCasos={0,1,2,6,4};
        casos= sc.nextInt();
        for (int i = 0; i < casos; i++) {
            numero=sc.nextInt();
            if (numero == 1 || numero== 0) {
                System.out.println(posiblesCasos[1]);
            }else if (numero == 2) {
                System.out.println(posiblesCasos[2]);
            }else if (numero == 3) {
                System.out.println(posiblesCasos[3]);
            }else if (numero == 4) {
                System.out.println(posiblesCasos[4]);
            }else System.out.println(posiblesCasos[0]);
        }
    }
}
