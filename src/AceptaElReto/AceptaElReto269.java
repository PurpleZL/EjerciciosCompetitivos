package AceptaElReto;

/*
3 
10 5 0
5 2 3 7 0
12 5 15 1 6 0

50
78
266
 */
public class AceptaElReto269 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos;
        int num;
        casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            int temp = 0;
            int total = 0;
            do {
                num = sc.nextInt();
                if (num != 0) {
                    temp += num;
                    total += temp * 2;
                }
            } while (num != 0);
            System.out.println(total);
        }
    }
}
