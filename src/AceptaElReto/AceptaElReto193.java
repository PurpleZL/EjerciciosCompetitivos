package AceptaElReto;

/*
36
904
1010
37
209
0

SI
SI
NO
NO
SI

al ser sumado a sí mismo tras invertir sus dígitos da como resultado un número en el que todos los dígitos son impares.
la cantidad de dígitos del número y de su versión invertida debe ser el mismo
 */
public class AceptaElReto193 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int num;
        do {
            num = sc.nextInt();
            if (num != 0) {
                if (esReversible(num)) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            }
        } while (num != 0);
    }

    private static boolean esReversible(int num) {
        String s = "" + num;
        String rs="";

        for (int i = s.length() - 1; i >= 0; i--) {
            rs+=s.charAt(i);
        }
        rs = "" + Integer.valueOf(rs);

        if (s.length() != rs.length()) {
            return false;
        }
        char[] c = ((Integer.parseInt(s) + Integer.parseInt(rs)) + "").toCharArray();
        for (char d : c) {
            if ((d - 0) % 2 == 0) {
                return false;
            }
        }

        return true;
    }
}
