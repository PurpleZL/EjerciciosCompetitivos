package AceptaElReto;

/*
22222
75
99
100
504
0

SI
NO
SI
NO
NO
 */
public class AceptaElReto115 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int num;
        String numPow;
        do {
            num = sc.nextInt();
            if (num != 0) {
                numPow = "" + (long) Math.pow(num, 2);
                if (esKaprekar(num, numPow)) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            }
        } while (num != 0);
    }

    private static boolean esKaprekar(int num, String pow) {
        if (num==1) {
            return true;
        }
        for (int i = 1; i < pow.length(); i++) {
            String left = pow.substring(0, i);
            String right = pow.substring(i);
            
            int numLeft = Integer.parseInt(left);
            int numRight = Integer.parseInt(right);
            
            if (numRight == 0) continue;
            
            if ( numLeft + numRight == num) {
                return true;
            }
        }
        return false;
    }
}
