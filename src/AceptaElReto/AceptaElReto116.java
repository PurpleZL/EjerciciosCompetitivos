package AceptaElReto;

/*

 */
public class AceptaElReto116 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        int repeticiones;
        repeticiones = sc.nextInt();
        imprimirHolaMundo(repeticiones);
    }
    public static void imprimirHolaMundo(int repeticiones) {
        for (int i = 0; i < repeticiones; i++) {
            System.out.println("Hola mundo.");
        }
    }
}
