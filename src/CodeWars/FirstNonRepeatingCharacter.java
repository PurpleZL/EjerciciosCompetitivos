package CodeWars;

/*
returns the first character that is not repeated anywhere in the string.
As an added challenge, upper- and lowercase letters are considered the same character,
but the function should return the correct case for the initial letter. 
For example, the input 'sTreSS' should return 'T'.

If a string contains all repeating characters, it should return an empty string ("");
 */
public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(firstNonRepeatingLetter("aA"));
    }
    
    public static String firstNonRepeatingLetter(String s) {
        String c="";
        for (int i = 0; i < s.length(); i++) {
            if (s.toLowerCase().indexOf(s.toLowerCase().charAt(i), i + 1) == -1&&c.toLowerCase().indexOf(s.toLowerCase().charAt(i))==-1) {
                return Character.toString(s.charAt(i));
            }else c+=s.charAt(i);
            if (i == s.length() - 1) {
                return "";
            }
        }
        return "";
    }
}
