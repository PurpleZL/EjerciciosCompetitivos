package CodeWars;

/*
Implement a pseudo-encryption algorithm which given a string S and an
integer N concatenates all the odd-indexed characters of S with all the 
even-indexed characters of S, this process should be repeated N times.

Examples:

encrypt("012345", 1)  =>  "135024"
encrypt("012345", 2)  =>  "135024"  ->  "304152"
encrypt("012345", 3)  =>  "135024"  ->  "304152"  ->  "012345"

encrypt("01234", 1)  =>  "13024"
encrypt("01234", 2)  =>  "13024"  ->  "32104"
encrypt("01234", 3)  =>  "13024"  ->  "32104"  ->  "20314"
Together with the encryption function, you should also implement a 
decryption function which reverses the process.

If the string S is an empty value or the integer N is not positive,
return the first argument without changes.
 */
public class SimpleEncryption1 {

    public static void main(String[] args) {
        System.out.println(encrypt("This is a test!", 2));
        System.out.println(decrypt("hsi  etTi sats!", 1));
    }

    public static String encrypt(final String text, final int n) {
        if (text == null || text.isBlank() || n < 0) {
            return text;
        }

        String odd = "", even = "", textEncrypted = text;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < textEncrypted.length(); j++) {
                if (j % 2 == 0) {
                    even += textEncrypted.charAt(j);
                } else {
                    odd += textEncrypted.charAt(j);
                }
            }
            textEncrypted = odd + even;
            even = "";
            odd = "";
        }
        return textEncrypted;
    }

    public static String decrypt(final String encrypted, final int n) {
        if (encrypted == null || encrypted.isBlank() || n <= 0) {
            return encrypted;
        }

        String temp = encrypted;

        for (int i = 0; i < n; i++) {
            String odd = temp.substring(0, temp.length() / 2);
            String even = temp.substring(temp.length() / 2);
            char[] result = new char[temp.length()];

            int oddIndex = 0, evenIndex = 0;
            for (int j = 0; j < temp.length(); j++) {
                if (j % 2 == 0) {
                    result[j] = even.charAt(evenIndex++);
                } else {
                    result[j] = odd.charAt(oddIndex++);
                }
            }

            temp = new String(result);
        }
        return temp;
    }
}
