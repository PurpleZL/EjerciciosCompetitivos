/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AceptaElReto;

/*
3
24 1 5
36 2 8
14 5 12

5
10
7
 */
public class AceptaElReto480 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos=sc.nextInt();
        for (int i = 0; i < casos; i++) {
            int uvas=sc.nextInt();
            int malas=sc.nextInt();
            int proporcion=sc.nextInt();
            int sobrantes;
            if (uvas%proporcion>malas) {
                sobrantes=malas;
            }else sobrantes=uvas%proporcion;
            System.out.println(uvas/proporcion*malas+sobrantes);
        }
    }
}
