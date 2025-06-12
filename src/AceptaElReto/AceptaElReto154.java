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
public class AceptaElReto154 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int nums;
        String letras;
        final String VOCALES = "AEIOU";
        
        while (true) {
            String matricula = sc.nextLine();
            nums = Integer.parseInt(matricula.substring(0, 4));
            letras = matricula.substring(5, 8);

            if (nums == 9999 && letras.equals("ZZZ")) {
                break;
            }

            if (nums < 9999) {
                nums++;
            } else {
                nums = 0;
                char[] letrasArray = letras.toCharArray();
                
                if (letrasArray[2] < 'Z') {
                    letrasArray[2]++;
                    if (VOCALES.indexOf(letrasArray[2]) >= 0) {
                        letrasArray[2]++;
                    }
                } else {
                    letrasArray[2] = 'B';
                    if (letrasArray[1] < 'Z') {
                        letrasArray[1]++;
                        if (VOCALES.indexOf(letrasArray[1]) >= 0) {
                            letrasArray[1]++;
                        }
                    } else {
                        letrasArray[1] = 'B';
                        letrasArray[0]++;
                        if (VOCALES.indexOf(letrasArray[0]) >= 0) {
                            letrasArray[0]++;
                        }
                    }
                }
                letras = new String(letrasArray);
            }

            System.out.printf("%04d %s%n", nums, letras);
        }
    }
}