package CodeWars;

/*
ROT13 is a simple letter substitution cipher that replaces a letter with 
the letter 13 letters after it in the alphabet. ROT13 is an example of 
the Caesar cipher.

Create a function that takes a string and returns the string ciphered 
with Rot13. If there are numbers or special characters included in the string,
they should be returned as they are. Only letters from the latin/english 
alphabet should be shifted, like in the original Rot13 "implementation".
 */
public class Rot13 {

    public static void main(String[] args) {
        System.out.println(rot13("Test"));
    }

    public static String rot13(String str) {
        String[] array = str.split("");
        char[] abcL = new char[39];
        for (int i = 0; i < 39; i++) {
            if (i<26) {
            abcL[i] = (char) ('a' + i);    
            }else abcL[i] = (char) ('a' + i -26);
        }
        char[] abcU = new char[39];
        for (int i = 0; i < 39; i++) {
            if (i<26) {
            abcU[i] = (char) ('A' + i);    
            }else abcU[i] = (char) ('A' + i -26);
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 26; j++) {
                if (array[i].equals(String.valueOf(abcL[j]))) {
                    array[i]=Character.toString(abcL[j+13]);
                    break;
                }else if (array[i].equals(String.valueOf(abcU[j]))) {
                    array[i]=Character.toString(abcU[j+13]);
                    break;
                }
            }
        }
        String rot13="";
        for (String string : array) {
            rot13+=string;
        }
        return rot13;
    }
}
