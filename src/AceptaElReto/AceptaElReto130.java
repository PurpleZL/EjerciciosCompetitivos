package AceptaElReto;

/*
5
1 2 4 3
5
1 2 3 0
10
0 0 0 1
0

2
1
IMPOSIBLE
 */
public class AceptaElReto130 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int n = sc.nextInt(); 
            if (n == 0) break;  

            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            int res = Math.abs(x1 - x2) + Math.abs(y1 - y2); 
            int res1 = Math.abs(x1 - x2); 
            if (x1 < n && x2 < n && y1 < n && y2 < n && res % 2 == 0) {
                if (x1 != x2 && y1 != y2 && (res1 + y1 == y2 || y1 - res1 == y2)) {
                    System.out.println(1);
                } else if (x1 == x2 && y1 == y2) {
                    System.out.println(0);
                } else {
                    System.out.println(2);
                }
            } else {
                System.out.println("IMPOSIBLE");
            }
        }
    }
}



