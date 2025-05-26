package CodeWars;

/*
Write a function that takes in a string of one or more words, 
and returns the same string, but with all words that have five 
or more letters reversed (Just like the name of this Kata).
Strings passed in will consist of only letters and spaces. 
Spaces will be included only when more than one word is present.

Examples:

"Hey fellow warriors"  --> "Hey wollef sroirraw" 
"This is a test        --> "This is a test" 
"This is another test" --> "This is rehtona test"
 */
public class SpinWords {

    public static void main(String[] args) {
        System.out.println(spinWords("Hey wollef sroirraw"));
    }

    public static String spinWords(String text) {
        String[] array = text.split(" ");
        String temp = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() >= 5) {
                temp = "";
                for (int j = array[i].length()-1; j >= 0; j--) {
                    temp += array[i].charAt(j);
                }
                array[i] = temp;
            }
        }
        temp = "";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                temp += array[i];
            } else {
                temp += array[i] + " ";
            }
        }
        return temp;
    }
}
