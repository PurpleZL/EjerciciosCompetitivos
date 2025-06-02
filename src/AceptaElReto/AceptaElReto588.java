package AceptaElReto;

/*
34
4
13
0

SI
SI
NO
 */
public class AceptaElReto588 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        long nums;
        do {
            nums = sc.nextLong();
            if (nums != 0) {
                String bin = Long.toBinaryString(nums);
//                if (bin.startsWith("0")) {
//                    bin = bin.substring(bin.indexOf("1"));
//                }
                if (bin.endsWith("0")) {
                    bin = bin.substring(0, bin.lastIndexOf("1")+1);
                }
                StringBuilder sb = new StringBuilder(bin);
                System.out.println((sb.toString().equals(sb.reverse().toString()))? "SI":"NO");
            }
        } while (nums != 0);
    }
}
