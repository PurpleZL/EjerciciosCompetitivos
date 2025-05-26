package AceptaElReto;

/*
5
27
24
4
234
4444

NO
SI
NO
SI
NO
 */
public class AceptaElReto428 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos;
        int midiclorianos;
        casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            midiclorianos = sc.nextInt();
            System.out.println((ladoOscuro(midiclorianos)) ? "SI" : "NO");
        }
    }

    private static boolean ladoOscuro(int b10) {
        String base5 = Long.toString(b10, 5);
        int count = base5.length() - base5.replace("4", "").length();
        return count > 1;
    }
}
