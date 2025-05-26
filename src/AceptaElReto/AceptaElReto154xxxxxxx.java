package AceptaElReto;

/*
1234 BBB
9999 BBZ
9999 BBD
9999 ZZZ

1235 BBB
0000 BCB
0000 BBF
 */
public class AceptaElReto154xxxxxxx {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int nums;
        StringBuilder letras = new StringBuilder();

        do {
            String matricula = sc.nextLine();
            nums = Integer.parseInt(matricula.substring(0, 4));
            letras.append(matricula.substring(5, 8));
            if (nums == 9999 && letras.toString().equals("ZZZ")) {
                break;
            }
            if (nums == 9999) {
                nums = 0;
                if (letras.charAt(2) == 'Z') {
                    if (letras.charAt(1) == 'Z') {
                        letras.setCharAt(0, (char) (letras.charAt(0) + 1));
                        if (letras.charAt(0) == 'E' || letras.charAt(0) == 'I' || letras.charAt(0) == 'O' || letras.charAt(0) == 'U') {
                            letras.setCharAt(0, (char) (letras.charAt(0) + 1));
                        }
                    }
                    letras.setCharAt(1, (char) (letras.charAt(1) + 1));
                    if (letras.charAt(1) == 'E' || letras.charAt(1) == 'I' || letras.charAt(1) == 'O' || letras.charAt(1) == 'U') {
                        letras.setCharAt(1, (char) (letras.charAt(1) + 1));
                    }
                    letras.setCharAt(2, 'B');
                } else {
                    letras.setCharAt(2, (char) (letras.charAt(2) + 1));
                    if (letras.charAt(2) == 'E' || letras.charAt(2) == 'I' || letras.charAt(2) == 'O' || letras.charAt(2) == 'U') {
                        letras.setCharAt(2, (char) (letras.charAt(2) + 1));
                    }
                }
            } else {
                nums++;
            }
            System.out.println(String.format("%04d %s", nums, letras));
            letras.setLength(0);

        } while (true);
    }
}
