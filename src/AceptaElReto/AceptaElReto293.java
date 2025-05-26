/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AceptaElReto;

/*
2
1 1 1 1 15
2 3 1 4 52

54
462
 */
public class AceptaElReto293 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos=sc.nextInt();
        int patas;
        long total;
        int escolopendras;
        for (int i = 0; i < casos; i++) {
            patas=sc.nextInt();
            total=patas*6;
            patas=sc.nextInt();
            total+=patas*8;
            patas=sc.nextInt();
            total+=patas*10;
            patas=sc.nextInt();
            escolopendras=sc.nextInt();
            total+=patas*escolopendras*2;
            System.out.println(total);
        }
    }
}
