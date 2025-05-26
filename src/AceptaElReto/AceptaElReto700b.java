package AceptaElReto;

/*
5
20 Dexter
35 The Wire
40 Dexter
20 Juego de Tronos
100 Black Mirror
4
45 aqui no hay quien viva
30 Erase una vez la vida
29 Stranger Things
15 Erase una vez la vida
0

Black Mirror
Dexter
The Wire
---
Erase una vez la vida
aqui no hay quien viva
---
 */
import java.util.*;

public class AceptaElReto700b {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numSeries;

        while ((numSeries = scanner.nextInt()) != 0) {
            scanner.nextLine();
            Map<String, Integer> seriesMap = new HashMap<>();

            for (int i = 0; i < numSeries; ++i) {
                String input = scanner.nextLine();
                int mins = Integer.parseInt(input.substring(0, input.indexOf(" ")));
                String serie = input.substring(input.indexOf(" ") + 1);
                if (seriesMap.containsKey(serie)) {
                    seriesMap.put(serie, seriesMap.get(serie) + mins);
                } else {
                    seriesMap.put(serie, mins);
                }
            }

            List<Map.Entry<String, Integer>> seriesList = new ArrayList<>(seriesMap.entrySet());

            Collections.sort(seriesList, new SeriesComparator());

            int i = 0;
            while (i < seriesList.size() && i < 3) {
                if (seriesList.get(i).getValue() < 30) {
                    break;
                }
                System.out.println(seriesList.get(i).getKey());
                i++;
            }
            System.out.println("---");
        }
    }

    static class SeriesComparator implements Comparator<Map.Entry<String, Integer>> {

        @Override
        public int compare(Map.Entry<String, Integer> p1, Map.Entry<String, Integer> p2) {
            if (p1.getValue().equals(p2.getValue())) {
                return p1.getKey().compareTo(p2.getKey());
            } else {
                return p2.getValue().compareTo(p1.getValue());
            }
        }
    }
}
