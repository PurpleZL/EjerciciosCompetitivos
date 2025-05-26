package AceptaElReto;

public class AceptaElReto362 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int numeroFecha;
        int[] array;
        numeroFecha = sc.nextInt();
        array = new int[numeroFecha * 2];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        comprobarFecha(array);
    }

    private static void comprobarFecha(int[] array) {
        int mesNavidad = 12, diaNavidad = 25;
        for (int i = 0; i < array.length; i++) {
            if (i%2==0) {
                if (mesNavidad == array[i + 1] && diaNavidad == array[i]) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
