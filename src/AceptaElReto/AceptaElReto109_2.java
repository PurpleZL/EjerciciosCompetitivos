package AceptaElReto;

/*
Junior
Buenisimos 3 Malisimos 0
Buenillos 2 Malillos 1
Buenillos 3 Malisimos 0
Buenisimos 3 Malillos 0
Buenisimos 2 Buenillos 1
Malisimos 0 Buenisimos 3
Malillos 1 Buenillos 2
Malisimos 0 Buenillos 3
Malillos 0 Buenisimos 3
Buenillos 1 Buenisimos 2
FIN
Senior
Abuelos 3 Abueletes 0
Abueletes 2 Abuelos 1
FIN
FIN

Buenisimos 2
EMPATE 0
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class AceptaElReto109_2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String categoria;
        String input;
        String[] partidos;
        int numPartidos = 0;
        HashMap<String, Integer> resultados;
        do {
            categoria = sc.nextLine();
            if (!categoria.equals("FIN")) {
                resultados = new HashMap<>();
                do {
                    input = sc.nextLine();
                    if (!input.equals("FIN")) {
                        numPartidos++;
                        partidos = input.split(" ");
                        if (!resultados.containsKey(partidos[0])) {
                            resultados.put(partidos[0], 0);
                        }
                        if (!resultados.containsKey(partidos[2])) {
                            resultados.put(partidos[2], 0);
                        }
                        if (Integer.parseInt(partidos[1]) > Integer.parseInt(partidos[3])) {
                            resultados.put(partidos[0], resultados.get(partidos[0]) + 2);
                            resultados.put(partidos[2], resultados.get(partidos[2]) + 1);
                        } else {
                            resultados.put(partidos[2], resultados.get(partidos[2]) + 2);
                            resultados.put(partidos[0], resultados.get(partidos[0]) + 1);
                        }
                    }
                } while (!input.equals("FIN"));
                String ganador="";
                int puntos=0;
                for (Map.Entry<String, Integer> categ : resultados.entrySet()) {
                    if (categ.getValue() > puntos) {
                        puntos = categ.getValue();
                        ganador = categ.getKey();
                    } else if (categ.getValue() == puntos) {
                        ganador = "EMPATE";
                    }
                }
                System.out.println(ganador+ " " +(resultados.size() * (resultados.size() - 1) - numPartidos));
                numPartidos = 0;
            }
        } while (!categoria.equals("FIN"));
    }
}
