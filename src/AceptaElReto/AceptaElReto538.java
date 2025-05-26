package AceptaElReto;

public class AceptaElReto538 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int aniosAbuelo, aniosIglesia;
        do {
            aniosAbuelo = sc.nextInt();
            aniosIglesia = sc.nextInt();
            if (aniosAbuelo != 0 || aniosIglesia != 0) {
                if (aniosAbuelo < aniosIglesia) {
                    System.out.println("SENIL");   
                }else if(aniosAbuelo >= aniosIglesia){
                    System.out.println("CUERDO");
                }
            }
        } while (aniosAbuelo != 0 || aniosIglesia != 0);
    }
}
