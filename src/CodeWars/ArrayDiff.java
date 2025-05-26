package CodeWars;

/*
Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
 */
public class ArrayDiff {
    public static void main(String[] args) {
        int[] a={1, 2, 2, 2, 3};
        int[] b={2};
        int[] c=arrayDiff(a, b);
        for (int i : c) {
            System.out.print(i);
        }
    }
    
    public static int[] arrayDiff(int[] a, int[] b) {
    if (a.length == 0) {
        return a;
    } else if (b.length == 0) {
        return a;
    }
    String resultS = "";
    boolean diff;
    for (int i : a) {
        diff = true;
        for (int j : b) {
            if (i == j) {
                diff = false;
            }
        }
        if (diff) {
            resultS += i + " ";
        }
    }
    
    if (resultS.isEmpty()) { 
        return new int[0];
    }
    
    String[] resultArray = resultS.trim().split(" ");
    int[] result = new int[resultArray.length];
    for (int i = 0; i < resultArray.length; i++) {
        result[i] = Integer.parseInt(resultArray[i]);
    }
    return result;
}

}
