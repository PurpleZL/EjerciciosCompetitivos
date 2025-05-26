package AceptaElReto;

/*
123 456
555 555
123 594
0 0

0
3
1
 */
public class AceptaElReto124 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        String num1;
        String num2;
        char[] digitos1;
        char[] digitos2;
        int llevadasTot;
        int llevadas;

        do {
            num1 = sc.next();
            num2 = sc.next();
            if (!num1.equals("0") || !num2.equals("0")) {

                digitos1 = num1.toCharArray();
                digitos2 = num2.toCharArray();

                if (digitos1.length < digitos2.length) {
                    digitos1 = digitos2;
                    digitos2 = num1.toCharArray();
                }

                llevadasTot = 0;
                llevadas = 0;

                for (int i = digitos1.length - 1, j = digitos2.length - 1; i >= 0; i--, j--) {
                    int d1 = digitos1[i] - '0';
                    int d2 = (j >= 0) ? digitos2[j] - '0' : 0;

                    if (d1 + d2 + llevadas > 9) {
                        llevadasTot++;
                        llevadas = 1;
                    } else {
                        llevadas = 0;
                    }
                }

                System.out.println(llevadasTot);
            }
        } while (!num1.equals("0") || !num2.equals("0"));
    }
}
