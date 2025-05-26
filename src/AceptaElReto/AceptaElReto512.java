package AceptaElReto;

/*
3
53 47
3 5
86 97

53
37
46
 */
public class AceptaElReto512 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos=sc.nextInt();
        for (int i = 0; i < casos; i++) {
            int conejo=sc.nextInt();
            int caballo=sc.nextInt();
            System.out.println((conejo*100)/(conejo+caballo));
        }
    }
}
