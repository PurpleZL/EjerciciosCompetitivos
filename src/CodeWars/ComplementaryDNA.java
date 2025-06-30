package CodeWars;

public class ComplementaryDNA {
    public static String makeComplement(String dna) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dna.length(); i++) {
            char c = dna.charAt(i);
            if (c == 'T') {
                sb.append('A');
            } else if (c == 'A') {
                sb.append('T');
            } else if (c == 'C') {
                sb.append('G');
            } else if (c == 'G') {
                sb.append('C');
            }
        }
        return sb.toString();
    }
}
