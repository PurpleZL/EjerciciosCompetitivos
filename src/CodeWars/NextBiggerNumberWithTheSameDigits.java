package CodeWars;

/*
  12 ==> 21
 513 ==> 531
2017 ==> 2071
10990 ==> 19009
  9 ==> -1
111 ==> -1
531 ==> -1
comparacion para que el cambio sea mayor al original, sino si gue cambiando
 */
public class NextBiggerNumberWithTheSameDigits {

    public static void main(String[] args) {
        System.out.println(nextBiggerNumber(10990));
    }

    public static long nextBiggerNumber(long n) {
        StringBuilder numberS = new StringBuilder(Long.toString(n));
        int pivotIndex = -1;

        for (int i = numberS.length() - 1; i > 0; i--) {
            if (numberS.charAt(i) > numberS.charAt(i - 1)) {
                pivotIndex = i - 1;
                break;
            }
        }

        if (pivotIndex == -1) {
            return -1;
        }

        // Encontrar el dígito más pequeño mayor que el pivote Ej; 12543
        int swapIndex = -1;
        for (int i = numberS.length() - 1; i > pivotIndex; i--) {
            if (numberS.charAt(i) > numberS.charAt(pivotIndex)) {
                swapIndex = i;
                break;
            }
        }

        char temp = numberS.charAt(pivotIndex);
        numberS.setCharAt(pivotIndex, numberS.charAt(swapIndex));
        numberS.setCharAt(swapIndex, temp);

        // Ordenar la porción derecha
        String rightPart = numberS.substring(pivotIndex + 1);
        char[] rightPartArray = rightPart.toCharArray();
        java.util.Arrays.sort(rightPartArray);
        StringBuilder sortedRightPart = new StringBuilder(new String(rightPartArray));

        return Long.parseLong(numberS.substring(0, pivotIndex + 1) + sortedRightPart);
    }
}
