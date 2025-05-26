package AceptaElReto;

/*
3
5 300 10
4 400 20
3 500 30

1400
1480
1410
 */
public class AceptaElReto191 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        int casos = sc.nextInt();
        
        for (int i = 0; i < casos; i++) {
            int compartimentos = sc.nextInt();
            int maxLitros = sc.nextInt();
            int diferencia = sc.nextInt();
            
            int ultimoTermino = maxLitros - (compartimentos - 1) * diferencia;
            int litrosTot = compartimentos * (maxLitros + ultimoTermino) / 2;
            
            System.out.println(litrosTot);
        }
    }
}
/*
public class AceptaElReto191 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        int casos;
        int compartimentos;
        int maxLitros;
        int diferencia;
        int litrosTot;
        
        casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            compartimentos = sc.nextInt();
            maxLitros = sc.nextInt();
            diferencia = sc.nextInt();
            litrosTot=0;
            for (int j = 0; j < compartimentos; j++) {
                litrosTot+=maxLitros;
                maxLitros-=diferencia;
            }
            System.out.println(litrosTot);
        }
    }
}
*/