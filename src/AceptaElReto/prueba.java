package AceptaElReto;

public class prueba {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        String input;
        int counter = 1;
        do {
            input = sc.nextLine();
            System.out.println("Input: " + counter++);
            if (!input.isEmpty()) {
                System.out.println(input + "\n");

            }else System.out.println("\"\"");
        } while (true);
    }
}
