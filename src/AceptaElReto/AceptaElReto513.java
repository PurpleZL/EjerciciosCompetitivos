package AceptaElReto;

/*
3
3 4 5
3
3 4 3

3 5 7
3 5 1
 */
//(3 + x) / 2 = 4 → x = 5.
public class AceptaElReto513 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        while (sc.hasNextInt()) {
            int dias = sc.nextInt();
            int[] medias = new int[dias];
            for (int i = 0; i < dias; i++) {
                medias[i] = sc.nextInt();
            }
            
            int sumaAcumulada = 0;
            String resultado = "";
            for (int i = 0; i < dias; i++) {
                int patentesDia = medias[i] * (i+1) - sumaAcumulada;
                sumaAcumulada += patentesDia;                
                if (i!=dias-1) {
                    resultado += patentesDia + " ";
                }else{
                    resultado += patentesDia;
                }
            }
            System.out.println(resultado);
        }
    }
}
