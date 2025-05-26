package CodeWars;

/*
get a string as text and an int as the rule of manipulation, and should return 
encrypted text. for example:
encrypt("a",1) = "b"
Full ascii table is used on our question (256 chars) - so 0-255 are the valid values.
If the value exceeds 255, it should 'wrap'. ie. if the value is 345 it should wrap to 89.
 */
public class BasicEncryption {

    public static void main(String[] args) {
        System.out.println(encrypt("a",1));
        System.out.println(encrypt("please encrypt me",2));
    }

    public static String encrypt(String text, int rule) {
        if (text.isBlank()) {
            return "";
        }
        while(rule>255)rule-=256;
        String res="";
        int ascii=0;
        for (int i = 0; i < text.length(); i++) {
            ascii=text.charAt(i)+rule;
            if (ascii>255) {
                ascii-=256;
            }
            res+=String.valueOf((char)ascii);
        }
        
        return res;
    }
}
