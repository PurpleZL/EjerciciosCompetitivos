package CodeWars;

public class WriteNumberInExpandedForm {
    public static String expandedForm(int num) {
        StringBuilder sb = new StringBuilder();
        while ((int) Math.log10(num) +1 > 0) {
            int n = (int) Math.pow(10, (int) Math.log10(num));
            int result = num / n * n;
            sb.append(result);
            sb.append(" + ");
            num -= result;
        }
        return sb.delete(sb.length()-3, sb.length()).toString();
    }

    public static void main(String[] args) {
        System.out.println(expandedForm(70304));
    }
}
