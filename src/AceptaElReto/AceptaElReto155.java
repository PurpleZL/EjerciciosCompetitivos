package AceptaElReto;

public class AceptaElReto155 {
        static java.util.Scanner sc = new java.util.Scanner(System.in);
        public static void main(String[] args) {
        int numeroX, numeroY;
            do {
                numeroX=sc.nextInt();
                numeroY=sc.nextInt();
                if (numeroX>=0&&numeroY>=0) {
                    System.out.println(numeroX*2+numeroY*2);
                }
            } while (numeroX>=0&&numeroY>=0);
    }
}
