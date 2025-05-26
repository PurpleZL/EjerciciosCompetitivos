package AceptaElReto;

/*
2460
1234
2
-1

SI
NO
SI
 */
public class AceptaElReto165 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        String num;
        char[] array;
        do {
            num = sc.nextLine();
            if (Integer.parseInt(num) >= 0) {
                array=num.toCharArray();
                if (todosPares(array)) {
                    System.out.println("SI");
                }else System.out.println("NO");
                
            }
        } while (Integer.parseInt(num) >= 0);
    }

    private static boolean todosPares(char[] array) {
        for (char c : array) {
            if ((c - 0)%2 !=0) {
                return false;
            }
        }
        return true;
    }
}
