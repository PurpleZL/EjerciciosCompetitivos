package AceptaElReto;

/*
6 .I....
6 .D.I..
4 ....
0

TODOS COMEN
ALGUNO NO COME
TODOS COMEN
 */
public class AceptaElReto172 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        int respuesta;
        String temp;
        do {
            respuesta = sc.nextInt();
            if (respuesta != 0) {
                temp = sc.nextLine();
                if (temp.contains("I") && temp.contains("D") || temp.contains("D") && temp.contains("I")) {
                    System.out.println("ALGUNO NO COME");
                } else {
                    System.out.println("TODOS COMEN");
                }
            }
        } while (respuesta != 0);

    }
}
