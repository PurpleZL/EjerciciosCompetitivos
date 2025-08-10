package CodeWars;


import java.util.Arrays;
import java.util.Comparator;

public class WeightForWeight {
    public static String orderWeight(String strng) {
        String[] numbers = strng.trim().split(" ");

        Arrays.sort(numbers, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                int weightA = a.chars().map(i -> i-'0').sum();
                int weightB = b.chars().map(i -> i-'0').sum();

                if (weightA != weightB) {
                    return weightA - weightB;
                } else {
                    return a.compareTo(b);
                }
            }
        });
        return String.join(" ", numbers);
    }
}

/*
* return
      Arrays.stream(strng.split(" "))
        .sorted(Comparator
          .comparing(WeightSort::sumDigits)
          .thenComparing(String::compareTo))
        .collect(Collectors.joining(" "));
* */