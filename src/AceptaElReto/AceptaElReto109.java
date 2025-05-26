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
import java.util.TreeMap;

public class AceptaElReto109 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String categoria;
        String input;
        String[] partidos;
        int numPartidos = 0;
        TreeMap<String, Integer> arrayNumPartidos = new TreeMap<>();
        HashMap<String, HashMap<String, Integer>> padel = new HashMap<>();
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
                padel.put(categoria, resultados);
                arrayNumPartidos.put(categoria, numPartidos);
                numPartidos = 0;
            }
        } while (!categoria.equals("FIN"));
        String ganador;
        int puntos;
        int participantes;
        for (Map.Entry<String, HashMap<String, Integer>> categ : padel.entrySet()) {
            ganador = "";
            puntos = 0;
            participantes = 0;
            for (Map.Entry<String, Integer> result : categ.getValue().entrySet()) {
                participantes++;
                if (result.getValue() > puntos) {
                    puntos = result.getValue();
                    ganador = result.getKey();
                } else if (result.getValue() == puntos) {
                    ganador = "EMPATE";
                }
            }
            System.out.println(ganador + " " + (participantes * (participantes - 1) - arrayNumPartidos.get(categ.getKey())));
        }
    }
}
