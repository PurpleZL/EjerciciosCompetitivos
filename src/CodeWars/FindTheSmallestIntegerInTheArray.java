package CodeWars;

import java.util.Arrays;

public class FindTheSmallestIntegerInTheArray {
    public static int findSmallestInt(int[] args) {
        return  Arrays.stream(args).min().getAsInt();
        //return Arrays.stream(args).sorted().findFirst().getAsInt();
    }

    public static void main(String[] args) {
        System.out.println(findSmallestInt(new int[]{78,56,-2,12,-8}));
    }
}
