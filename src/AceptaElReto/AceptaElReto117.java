package AceptaElReto;

public class AceptaElReto117 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int noConoce;
        noConoce = sc.nextInt();
        sc.nextLine();
        reconocerPersona(noConoce);
    }

    private static void reconocerPersona(int noConoce) {
        String persona;
        String[] array = new String [noConoce];
        for (int i = 0; i < noConoce; i++) {
            persona = sc.nextLine();
            array[i]=persona.substring(4);
        }
        for (int i = 0; i < noConoce; i++) {
            System.out.println("Hola, "+array[i]+".");
        }
    }
}
