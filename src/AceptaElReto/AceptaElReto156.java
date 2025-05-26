package AceptaElReto;

/*
0 1 5 2 0 3 9 -1
5 5 4 -1
1 2 3 4 5 -1
-1

19
1
4
 */
public class AceptaElReto156 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int num;
        int temp;
        int movimiento;

        do {
            num = sc.nextInt();
            if (num < 0) break;
            temp = num;
            movimiento = 0;
            do {
                num = sc.nextInt();
                if (num < 0) break;
                movimiento += Math.abs(temp - num);
                temp = num;
            } while (true);
            System.out.println(movimiento);
        } while (true);
    }
}
