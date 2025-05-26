package AceptaElReto;

/*(1 micra = 10-6 metros)
1 1
2 1
1 10

20
19
24
 */
import java.util.Scanner;

public class AceptaElReto436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            long papel = sc.nextLong();
            long edificio = sc.nextLong() * 1000000;
            int total = 0;
            long aux = papel; 
            
            while (aux < edificio) {
                aux *= 2;
                total++;
            }
            
            System.out.println(total);
        }
    }
}
