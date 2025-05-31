package AceptaElReto;

/*
2
ARRA
AAAA

2
4
*/
public class AceptaElReto587 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        int casos = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < casos; i++) {
            String color = sc.nextLine();
            int mins = 0;
            for (int j = 0; j < color.length()-1; j+=2) {
                if (color.charAt(j) == color.charAt(j+1)) {
                    mins+=2;
                }else mins++;
            }
            System.out.println(mins);
        }
    }
}
