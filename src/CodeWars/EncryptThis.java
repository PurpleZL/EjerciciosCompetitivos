package CodeWars;

/*
Your message is a string containing space separated words.
You need to encrypt each word in the message using the 
following rules:
The first letter must be converted to its ASCII code.
The second letter must be switched with the last letter
Keepin' it simple: There are no special characters in the input.

Examples:
Kata.encryptThis("Hello") => "72olle"
Kata.encryptThis("good") => "103doo"
Kata.encryptThis("hello world") => "104olle 119drlo"
 */
public class EncryptThis {

    public static void main(String[] args) {
        System.out.println(encryptThis("Hello"));
        System.out.println(encryptThis("hello world"));
        System.out.println(encryptThis("good"));
    }

    public static String encryptThis(String text) {
        if (text.isBlank()) {
            return "";
        }
        String[] arrayS = text.split(" ");
        char temp='x';
        int ascii=0;
        String res="";
        for (int i = 0; i < arrayS.length; i++) {
            char[] array=arrayS[i].toCharArray();
            for (int j = 0; j < arrayS[i].length(); j++) {
                if (j == 0) {
                    ascii=arrayS[i].charAt(j);
                }else if (j == 1) {
                    temp=array[j];
                    array[j]=array[arrayS[i].length()-1];
                }else if (j==arrayS[i].length()-1) {
                    array[j]=temp;
                }
            }
            res+=" "+ascii+ String.copyValueOf(array, 1, array.length-1);
            //tambien vale esto a al hora de transformar el array de chars new String(array, 1, array.length - 1)
        }

        return res.trim();
    }
}
