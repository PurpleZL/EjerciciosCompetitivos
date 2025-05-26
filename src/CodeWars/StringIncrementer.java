package CodeWars;

/*
    -If the string already ends with a number, the number should be incremented by 1.
    -If the string does not end with a number. the number 1 should be appended to the new string.

Examples:

foo -> foo1
foobar23 -> foobar24
foo0042 -> foo0043
foo9 -> foo10
foo099 -> foo100
 */
public class StringIncrementer {

    public static void main(String[] args) {
        System.out.println(incrementString("RUGfUP>0ijmK_V~Os9E\\wyJa3Xzj108178630917595170178690679742"));
    }

    public static String incrementString(String str) {
        String numS = "";
        int size;
        if (str.isEmpty()) {
            return "1";
        }
        if (Character.isDigit(str.charAt(str.length() - 1))) {
            for (int i = str.length() - 1; i >= 0; i--) {
                if (Character.isDigit(str.charAt(i))) {
                    numS = str.charAt(i) + numS;
                } else {
                    break;
                }
            }

            size = numS.length();
            str = str.substring(0, str.length() - numS.length());

            String incremented = incrementStringAsNumber(numS);

            while (incremented.length() < size) {
                incremented = "0" + incremented;
            }

            return str + incremented;

        } else {
            return str + 1;
        }
    }

    private static String incrementStringAsNumber(String num) {
        StringBuilder result = new StringBuilder();
        int carry = 1;

        for (int i = num.length() - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0' + carry;
            if (digit >= 10) {
                carry = 1;
                digit -= 10;
            } else {
                carry = 0;
            }
            result.insert(0, digit);
        }

        if (carry > 0) {
            result.insert(0, carry);
        }

        return result.toString();
    }
}
