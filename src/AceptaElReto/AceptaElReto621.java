package AceptaElReto;

public class AceptaElReto621 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos, pagina;
        casos=sc.nextInt();
        for (int i = 0; i < casos; i++) {
            pagina=sc.nextInt();
            if (pagina%2==0) {
                System.out.println(pagina+1);
            }else if(pagina%2==1){
                System.out.println(pagina-1);
            }
        }
    }
}
