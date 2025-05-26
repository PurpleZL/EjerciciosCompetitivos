package AceptaElReto;

public class AceptaElReto112 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        double distancia, velocidad, segundos, velReal;
        do {
            distancia = sc.nextDouble();
            velocidad = sc.nextDouble();
            segundos = sc.nextDouble();
            if (distancia != 0 || velocidad != 0 || segundos != 0) {
                if (distancia > 0 && velocidad > 0 && segundos > 0) {
                    velocidad = velocidad * 1000 / 3600;
                    velReal = distancia / segundos;
                    if (velReal >= velocidad * 1.2) {
                        System.out.println("PUNTOS");
                    } else if (velReal > velocidad) {
                        System.out.println("MULTA");
                    } else {
                        System.out.println("OK");
                    }
                } else {
                    System.out.println("ERROR");
                }
            }
        } while (distancia != 0 || velocidad != 0 || segundos != 0);
    }
}
