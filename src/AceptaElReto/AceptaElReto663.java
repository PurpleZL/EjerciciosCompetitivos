package AceptaElReto;

public class AceptaElReto663 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos, años;
        casos=sc.nextInt();
        for (int i = 0; i < casos; i++) {
            años=sc.nextInt();
            if (años > 0) {
                System.out.println(años-1);
            }else if(años <= 0){
                System.out.println(años);
            }
        }
    }
}
