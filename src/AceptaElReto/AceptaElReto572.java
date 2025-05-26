package AceptaElReto;

/*
3
5.0 7.5 4.0 6.5 0.8
4.8 0.0 6.3 4.5 9.5
8.5 7.0 8.2 0.0 1.2

MEDIA
MEDIA
SUSPENSO DIRECTO
 */
public class AceptaElReto572 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos=sc.nextInt();
        sc.nextLine();   
        for (int i = 0; i < casos; i++) {
            String[] array=sc.nextLine().split(" ");
            double nota1=Double.parseDouble(array[0]);
            double nota2=Double.parseDouble(array[1]);
            double nota3=Double.parseDouble(array[2]);
            double nota4=Double.parseDouble(array[3]);
            double nota5=Double.parseDouble(array[4]);

            if (nota1>=9 ||nota2>=9 ||nota3>=9 ||nota4>=9 ||nota5>=9) {
                System.out.println("MEDIA");
            }else if (nota1==0 ||nota2==0 ||nota3==0 ||nota4==0 ||nota5==0) {
                System.out.println("SUSPENSO DIRECTO");
            }else System.out.println("MEDIA");
        }
    }
}
