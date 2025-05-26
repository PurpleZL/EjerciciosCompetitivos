package AceptaElReto;

/*

 */
public class AceptaElReto371 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int input = -1;
        do {
            input = sc.nextInt();
            int result = 0;
            if (input != 0) {
                for (int i = 0; i <= input; i++) {
                    result+=i;
                }
                System.out.println(result*3);
            }
        } while (input != 0);
    }
}
