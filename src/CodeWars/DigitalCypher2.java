package CodeWars;

import java.util.List;

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
Write a function that accepts an array of integers code and a key number. 
As the result, it should return string containg a decoded message from the code.
decode([ 20, 12, 18, 30, 21],1939);  ==> "scout"
 */
public class DigitalCypher2 {

    public static void main(String[] args) {
        
        int[] testEncode = encode("scout", 1939);
        /*
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] + " ");
        }
        */
        String testDecode = decode(testEncode, 1939);
        System.out.println(testDecode);
    }

    public static String decode(int[] array, int key) {
        char[] keyArray = String.valueOf(key).toCharArray();
        int[] code = new int[array.length];
        List<Character> abc = List.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
        String decoded = "";
        int counter = 0;
        for (int i = 0; i < code.length; i++) {
            if (counter>=keyArray.length) {
                counter=0;
                code[i] = array[i]-1 - Character.getNumericValue(keyArray[counter]);
                decoded += abc.get(code[i]);
                counter++;
            } else {
                code[i] = array[i]-1 - Character.getNumericValue(keyArray[counter]);
                decoded += abc.get(code[i]);
                counter++;
            }
        }
        return decoded;
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
