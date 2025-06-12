package AceptaElReto;

/*
2 #
0

|----------------|
|  ##  ##  ##  ##|
|  ##  ##  ##  ##|
|##  ##  ##  ##  |
|##  ##  ##  ##  |
|  ##  ##  ##  ##|
|  ##  ##  ##  ##|
|##  ##  ##  ##  |
|##  ##  ##  ##  |
|  ##  ##  ##  ##|
|  ##  ##  ##  ##|
|##  ##  ##  ##  |
|##  ##  ##  ##  |
|  ##  ##  ##  ##|
|  ##  ##  ##  ##|
|##  ##  ##  ##  |
|##  ##  ##  ##  |
|----------------|
 */
public class XAceptaElReto162 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n;
        String simbolo;
        do {
            n = sc.nextInt();
            sc.nextLine();
            simbolo = sc.nextLine();
            System.out.println("|----------------|");
            for (int j = 0; j < 16 / n; j++) {
                if (j % 2 == 0) {
                    for (int k = 0; k < n; k++) {
                        System.out.print("|");
                        System.out.print((" ".repeat(n) + simbolo.repeat(n)).repeat(16/n/2));
                        System.out.println("|");
                    }
                } else if (j % 2 != 0) {
                    for (int k = 0; k < n; k++) {
                        System.out.print("|");
                        System.out.print((simbolo.repeat(n) + " ".repeat(n)).repeat(16/n/2));
                        System.out.println("|");
                    }
                }
            }
            System.out.println("|----------------|");
        } while (n != 0);
    }
}
