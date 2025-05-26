package CodeWars;

/*
['ninja', 'samurai', 'ronin'] --> "ninja, samurai and ronin"
Empty string values should be ignored.
Empty arrays or null/nil/None values being passed into the method
should result in an empty string being returned.
 */
public class FormatWordsIntoASentence {

 public static String formatWords(String[] words) {
    if (words == null || words.length == 0) {
        return ""; // 
    }

    String text = "";
    int validWordCount = 0; 

  
    for (String word : words) {
        if (word != null && !word.isBlank()) {
            validWordCount++;
        }
    }

    int currentWordIndex = 0;
    for (int i = 0; i < words.length; i++) {
        if (words[i] != null && !words[i].isBlank()) {
            if (currentWordIndex == 0) {
                text += words[i];
            } else if (currentWordIndex == validWordCount - 1) {
                text += " and " + words[i];
            } else {
                text += ", " + words[i];
            }
            currentWordIndex++;
        }
    }

    return text;
}



}
