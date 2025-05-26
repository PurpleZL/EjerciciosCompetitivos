package CodeWars;

/*
sumStrings('1','2') // => '3'
48-57
0-9
 */
public class SumStringsAsNumbers {

    public static void main(String[] args) {
        System.out.println(sumStrings("123", "456"));
    }

    public static String sumStrings(String a, String b) {
        a = removeLeadingZeros(a);
        b = removeLeadingZeros(b);

        String text = "";
        int count = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || count > 0) {
            int digitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int digitB = (j >= 0) ? b.charAt(j) - '0' : 0;

            int sum = digitA + digitB + count;
            text = (sum % 10) + text;
            count = sum / 10;

            i--;
            j--;
        }

        return text;
    }

    private static String removeLeadingZeros(String s) {
        int index = 0;
        while (index < s.length() - 1 && s.charAt(index) == '0') {
            index++;
        }
        return s.substring(index);
    }

}
