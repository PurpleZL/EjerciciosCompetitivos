package AceptaElReto;

import java.util.HashSet;

/*
4
9/6/1961 22/10/1938 31/5/1961 20/4/1964
5
9/6/1961 22/10/1938 31/5/1961 20/4/1964 9/6/1934
0

NO
SI
 */
public class AceptaElReto416 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos;
        String[] cumples;
        do {
            casos = sc.nextInt();
            sc.nextLine();
            if (casos != 0) {
                cumples = sc.nextLine().split(" ");
                System.out.println((hayCumple(cumples, casos)) ? "SI" : "NO");
            }
        } while (casos != 0);
    }

    private static boolean hayCumple(String[] cumples, int casos) {
        HashSet hs = new HashSet();
        for (int i = 0; i < casos; i++) {
            String[] temp = cumples[i].split("/");
            String dia = temp[0];
            String mes = temp[1];
            if (!hs.contains(dia+"/"+mes)) {
                hs.add(dia+"/"+mes);
            }else return true;
        }
        return false;
    }
}
