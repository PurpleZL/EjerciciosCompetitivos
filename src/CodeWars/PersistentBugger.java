package CodeWars;

public class PersistentBugger {
    public static int persistence(long n) {
        int counter = 0;
        while (true){
            String temp = String.valueOf(n);
            if (temp.length()<2) break;
            counter++;
            n = 1;
            for (int i = 0; i < temp.length(); i++) {
                int a = temp.charAt(i)-'0';
                n *= a;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(persistence(39));
    }
}
