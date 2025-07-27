package CodeWars;


public class RomanNumeralsHelper {
    public static void main(String[] args) {
        System.out.println(fromRoman("LXXXVI"));
    }

    private static final String[] ROMAN_SYMBOLS = {
            "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
    };

    private static final int[] DECIMAL_VALUES = {
            1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
    };

    public static String toRoman(int n) {
        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < DECIMAL_VALUES.length; i++) {
            while (n >= DECIMAL_VALUES[i]) {
                roman.append(ROMAN_SYMBOLS[i]);
                n -= DECIMAL_VALUES[i];
            }
        }

        return roman.toString();
    }

    public static int fromRoman(String romanNumeral) {
        int num = 0;
        int i = 0;

        while (i < romanNumeral.length()) {
            if (i + 1 < romanNumeral.length()) {
                String twoChars = romanNumeral.substring(i, i + 2);
                int value = getRomanValue(twoChars);

                if (value != 0) {
                    num += value;
                    i += 2;
                    continue;
                }
            }

            String oneChar = romanNumeral.substring(i, i + 1);
            num += getRomanValue(oneChar);
            i++;
        }

        return num;
    }

    private static int getRomanValue(String symbol) {
        switch (symbol) {
            case "M":  return 1000;
            case "CM": return 900;
            case "D":  return 500;
            case "CD": return 400;
            case "C":  return 100;
            case "XC": return 90;
            case "L":  return 50;
            case "XL": return 40;
            case "X":  return 10;
            case "IX": return 9;
            case "V":  return 5;
            case "IV": return 4;
            case "I":  return 1;
            default:   return 0;
        }
    }
}

/*
+--------+-------+
| Symbol | Value |
+--------+-------+
|    M   |  1000 |
|   CM   |   900 |
|    D   |   500 |
|   CD   |   400 |
|    C   |   100 |
|   XC   |    90 |
|    L   |    50 |
|   XL   |    40 |
|    X   |    10 |
|   IX   |     9 |
|    V   |     5 |
|   IV   |     4 |
|    I   |     1 |
+--------+-------+
*/