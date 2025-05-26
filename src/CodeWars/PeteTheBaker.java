package CodeWars;

import java.util.Map;

/*
must return 2
cakes({flour: 500, sugar: 200, eggs: 1}, {flour: 1200, sugar: 1200, eggs: 5, milk: 200}); 
must return 0
cakes({apples: 3, flour: 300, sugar: 150, milk: 100, oil: 100}, {sugar: 500, flour: 2000, milk: 2000}); 
 */
public class PeteTheBaker {

    public static void main(String[] args) {

    }

    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        String[] array= recipe.keySet().toArray(new String[0]); 
        int counter=Integer.MAX_VALUE;
        int temp;
        for (String array1 : array) {
            if (available.containsKey(array1)) {
                temp = available.get(array1) / recipe.get(array1);
                if (temp<=counter) {
                    counter=temp;
                }
            } else {
                return 0;
            }
        }
        return counter;
    }
}
