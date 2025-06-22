package CodeWars;

public class GetTheMiddleCharacter {
    public static void main(String[] args) {
        System.out.println(getMiddle("middle"));
    }
    public static String getMiddle(String word) {
        return (word.length()%2==0)?
                word.substring(word.length()/2 -1, word.length()/2 +1)
                :
                ""+word.charAt(word.length()/2);
    }
}
