package CodeWars;

import java.util.ArrayList;
import java.util.List;

/*

 */
public class TheObservedPIN {

    public static void main(String[] args) {
        System.out.println(getPINs("29"));
    }

    public static List<String> getPINs(String observed) {
        List<String> result = new ArrayList<>();
        
        List<List<Integer>> p = new ArrayList<>();
        p.add(List.of(0, 8));                // Vecinos de 0
        p.add(List.of(1, 2, 4));            // Vecinos de 1
        p.add(List.of(2, 1, 3, 5));         // Vecinos de 2
        p.add(List.of(3, 2, 6));            // Vecinos de 3
        p.add(List.of(4, 1, 5, 7));         // Vecinos de 4
        p.add(List.of(5, 2, 4, 6, 8));      // Vecinos de 5
        p.add(List.of(6, 3, 5, 9));         // Vecinos de 6
        p.add(List.of(7, 4, 8));            // Vecinos de 7
        p.add(List.of(8, 5, 7, 9, 0));      // Vecinos de 8
        p.add(List.of(9, 6, 8));            // Vecinos de 9

        generateCombinations(observed, p, "", 0, result);

        return result;
    }

    private static void generateCombinations(String observed, List<List<Integer>> p, String current, int index, List<String> result) {
        if (index == observed.length()) {
            result.add(current);
            return;
        }
        int digit = observed.charAt(index) - '0';
        List<Integer> neighbors = p.get(digit);
        // Generar combinaciones recursivamente
        for (int neighbor : neighbors) {
            generateCombinations(observed, p, current + neighbor, index + 1, result);
        }
    }
}
