package CodeWars;

public class CountingDuplicates {
    public static void main(String[] args) {
        System.out.println(duplicateCount("abcdefghijklmnopqrstuvwxyzaaAb"));
    }
    public static int duplicateCount(String text) {
        text = text.toLowerCase();
        int[] charCounts = new int[256];
        int duplicates = 0;

        for (char c : text.toCharArray()) {
            charCounts[c]++;
        }

        for (int count : charCounts) {
            if (count > 1) duplicates++;
        }

        return duplicates;
    }
}
