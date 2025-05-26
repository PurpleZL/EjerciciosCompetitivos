package AceptaElReto;

/*
5
3524
1111
1121
6174
1893

3
8
5
0
7
 */
public class AceptaElReto100xxxxxxxxxxxxxxx {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            int num = sc.nextInt();
            if (num == 6174) {
                System.out.println("0");
            } else if (repdigits(num)) {
                System.out.println("8");
            } else {
                int counter = 0;
                while (num != 6174) {
                    int mayor = ordenarMayor(num);
                    int menor = ordenarMenor(num);
                    num = mayor - menor;
                    counter++;
                }
                System.out.println(counter);
            }
        }
    }

    private static boolean repdigits(int num) {
        String numS = String.valueOf(num);
        char first = numS.charAt(0);
        for (char c : numS.toCharArray()) {
            if (c != first) {
                return false;
            }
        }
        return true;
    }

    public static int ordenarMayor(int num) {
        char[] numC = String.format("%04d", num).toCharArray();
        for (int j = 0; j < numC.length; j++) {
            for (int k = j + 1; k < numC.length; k++) {
                if (numC[j] < numC[k]) { 
                    char temp = numC[j];
                    numC[j] = numC[k];
                    numC[k] = temp;
                }
            }
        }
        return Integer.parseInt(new String(numC)); 
    }

    public static int ordenarMenor(int num) {
        char[] numC = String.format("%04d", num).toCharArray();
        for (int j = 0; j < numC.length; j++) {
            for (int k = j + 1; k < numC.length; k++) {
                if (numC[j] > numC[k]) { 
                    char temp = numC[j];
                    numC[j] = numC[k];
                    numC[k] = temp;
                }
            }
        }
        return Integer.parseInt(new String(numC)); 
    }

}
