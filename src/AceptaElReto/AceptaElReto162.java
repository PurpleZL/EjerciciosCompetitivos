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
public class AceptaElReto162 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n;
        String simbolo;
        String[] input;
        do {
            input = sc.nextLine().split(" ");
            n = Integer.parseInt(input[0]);
            if (n != 0) {
                StringBuilder output = new StringBuilder();
                String bordes = "|" + ancho(8 * n) + "|";
                output.append(bordes + '\n');
                simbolo = input[1];
                for (int i = 0; i < 8 * n; i++) {
                    output.append("|");
                    for (int j = 0; j < 8 * n; j++) {
                        int escaqueFila = i / n;
                        int escaqueCol = j / n;
                        if ((escaqueFila + escaqueCol) % 2 == 0) {
                            output.append(" ");
                        } else {
                            output.append(simbolo);
                        }
                    }
                    output.append("|" + '\n');
                }
                output.append(bordes);
                System.out.println(output.toString());
            }
        } while (n != 0);
    }

    private static String ancho(int i) {
        String temp = "";
        for (int j = 0; j < i; j++) {
            temp += "-";
        }
        return temp;
    }
}
