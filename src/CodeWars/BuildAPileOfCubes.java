package CodeWars;

public class BuildAPileOfCubes {
    public static long findNb(long m) {
        long n = 0;
        long tot = 0;
        while (tot < m) {
            n++;
            tot += n * n * n;
        }
        return tot == m ? n : -1;
    }

    public static void main(String[] args) {
        System.out.println(findNb(1071225));
    }
}

