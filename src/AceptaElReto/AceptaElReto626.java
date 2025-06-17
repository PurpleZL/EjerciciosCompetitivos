package AceptaElReto;

/*
3
04/12/0061
29/02/1500
01/01/0444

29/02/0064
29/02/1504
29/02/0444
 */
public class AceptaElReto626 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        int casos = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < casos; i++) {
            String fechaStr = sc.nextLine();
            String[] partes = fechaStr.split("/");
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int anio = Integer.parseInt(partes[2]);
            
            int anioBusqueda = anio;
            if (mes < 2 || (mes == 2 && dia < 29)) {
                anioBusqueda = anio;
            } else {
                anioBusqueda = anio + 1;
            }
            
            int proximoBisiesto = anioBusqueda;
            while (true) {
                if (proximoBisiesto % 4 == 0) {
                    break;
                }
                proximoBisiesto++;
            }
            System.out.printf("29/02/%04d\n", proximoBisiesto);
        }
    }
}
