package CodeWars;

/*
 a  b  c  d  e  f  g  h  i  j  k  l  m
 1  2  3  4  5  6  7  8  9 10 11 12 13
 n  o  p  q  r  s  t  u  v  w  x  y  z
14 15 16 17 18 19 20 21 22 23 24 25 26

Then we add to each obtained digit consecutive digits from the key.
For example. In case of key equal to 1939:
   s  c  o  u  t
  19  3 15 21 20
 + 1  9  3  9  1
 ---------------
  20 12 18 30 21
Write a function that accepts str string and key number and returns an array of 
integers representing encoded str.
Encode("scout",1939);  ==>  [ 20, 12, 18, 30, 21]
 */
import java.util.List;


public class DigitalCypher {

    public static void main(String[] args) {
        int[] test = encode("scout", 1939);
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i]+" ");
        }
    }

    public static int[] encode(String message, int key) {
        List<Character> abc = List.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
        char[] keyArray = String.valueOf(key).toCharArray();
        int[] encoded = new int[message.length()];
        int counter = 0;
        for (int i = 0; i < message.length(); i++) {
            if (counter >= keyArray.length) {
                counter = 0;
                encoded[i] = abc.indexOf(message.charAt(i)) + 1 + Character.getNumericValue(keyArray[counter]);
                counter++;
            } else {
                encoded[i] = abc.indexOf(message.charAt(i)) + 1 + Character.getNumericValue(keyArray[counter]);
                counter++;
            }
        }
        return encoded;
    }
}
