package AceptaElReto;

public class AceptaElReto682 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos, patos;
        casos=sc.nextInt();
        for (int i = 0; i < casos; i++) {
            patos=sc.nextInt();
            System.out.print(patos);
            System.out.println(" "+patos*2);
        }
    }
}
