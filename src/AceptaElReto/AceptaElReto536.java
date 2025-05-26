package AceptaElReto;

/*
2
25 5 10 30 Amapola Grande
20 10 15 40 Rosa Espinosa
3
30 20 25 35 Col & Flor
30 10 30 45 Ramon Omeol Vides
30 15 20 55 Nemesio Labrador

Amapola Grande
Nemesio Labrador
 */
import java.util.Scanner;

public class AceptaElReto536 {

    static class Terreno {

        int tamaño;
        int abono;
        int agua;
        int distancia;
        String nombre;

        public Terreno(String[] datos) {
            this.tamaño = Integer.parseInt(datos[0]);
            this.abono = Integer.parseInt(datos[1]);
            this.agua = Integer.parseInt(datos[2]);
            this.distancia = Integer.parseInt(datos[3]);
            this.nombre = construirNombre(datos);
        }

        private String construirNombre(String[] datos) {
            StringBuilder sb = new StringBuilder();
            for (int i = 4; i < datos.length; i++) {
                if (i > 4) {
                    sb.append(" ");
                }
                sb.append(datos[i]);
            }
            return sb.toString();
        }

        public boolean esMejorQue(Terreno otro) {
            if (this.tamaño != otro.tamaño) {
                return this.tamaño > otro.tamaño;
            }
            if (this.agua != otro.agua) {
                return this.agua < otro.agua;
            }
            if (this.distancia != otro.distancia) {
                return this.distancia < otro.distancia;
            }
            return this.abono < otro.abono;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int casos = sc.nextInt();
            sc.nextLine();

            Terreno mejorTerreno = null;

            for (int i = 0; i < casos; i++) {
                String[] datos = sc.nextLine().split(" ");
                Terreno actual = new Terreno(datos);

                if (mejorTerreno == null || actual.esMejorQue(mejorTerreno)) {
                    mejorTerreno = actual;
                }
            }
            System.out.println(mejorTerreno.nombre);
        }
    }
}
