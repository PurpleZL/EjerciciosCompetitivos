package AceptaElReto;

/*
5 3000 3500 3200 3400 3200
4 4000 3500 3500 3200
0

3
3
 */
public class AceptaElReto171 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);
// sean más altas que todas las montañas que tengan al Este

    public static void main(String[] args) {
        String input;
        do {
            input = sc.nextLine();
            if (!input.equals("0")) {
                String[] array = input.split(" ");
                int abadias = 0;
                boolean condicion = false;
                for (int i = 1; i < array.length; i++) {
                    for (int j = i+1; j < array.length; j++) {
                        if (j < array.length) {
                            if (Integer.parseInt(array[i]) <= Integer.parseInt(array[j])) {
                                condicion=false;
                                break;
                            }else condicion=true;
                        }
                    }
                    if (condicion) {
                        abadias++;
                        condicion=false;
                    }
                }
                abadias++;
                System.out.println(abadias);
            }
        } while (!input.equals("0"));
    }
}
