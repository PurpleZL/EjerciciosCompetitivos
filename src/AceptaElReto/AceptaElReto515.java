/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AceptaElReto;

/*
1
3
0

1
2
 */
public class AceptaElReto515 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int copas;
        do {
            copas = sc.nextInt();
            if (copas!=0) {
                int total = copas;
                int counter = 0;
                boolean hermano = true;
                do {
                    if (hermano) {
                        total-=1;
                        counter++;
                        hermano=false;
                    } else {
                        if (total % 2 == 0) {
                            total-=2;
                            counter++;
                            hermano=true;
                        } else {
                            total-=1;
                            counter++;
                            hermano=true;
                        }
                    }
                } while (total>0);
                System.out.println(counter);
            }
        } while (copas != 0);
    }
}
