package CodeWars;

import java.util.ArrayList;

/*
pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
pigIt('Hello world !');     // elloHay orldway !
 */
public class SimplePigLatin {
    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool"));
    }

    public static String pigIt(String str) {
        ArrayList <Character> pig = new ArrayList<>();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            pig.add(arr[i]);
        }
        int position = 0;
        for (int i = 0; i < pig.size(); i++) {
            if (Character.isAlphabetic(pig.get(i))) {
                if (pig.get(i).equals(' ')) {
                    pig.add(i, pig.get(position));//PigP
                    pig.add(i + 1, 'a');//PigPa
                    pig.add(i + 2, 'y');//PigPay
                    pig.remove(position);//igPay
                    i+=2;
                    position=i;
                }
            }
        }
        String s="";
        for (Object object : pig) {
            s+=object;
        }
        return s;
    }
}
