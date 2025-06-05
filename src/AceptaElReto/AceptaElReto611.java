package AceptaElReto;

import java.util.TreeMap;

/*
1902 Connan Doyle
3
1892 Las aventuras de Sherlock Holmes
1905 El retorno de Sherlock Holmes
1902 El sabueso de los Baskerville
2000 Sean Connery
3
1989 Indiana Jones y la ultima cruzada
1963 Desde Rusia con amor
1987 Los intocables de Eliot Ness

El sabueso de los Baskerville
NINGUNA
 */
public class AceptaElReto611 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        while (sc.hasNext()) {            
            int anioInicio = sc.nextInt();
            sc.nextLine();
            int casos = sc.nextInt();
            sc.nextLine();
            TreeMap<Integer, String> hm = new TreeMap();
            int counter=0;
            for (int i = 0; i < casos; i++) {
                int n = sc.nextInt();
                String s = sc.nextLine();
                if (n >= anioInicio) {
                    counter ++;
                    hm.put(n,s.substring(s.indexOf(" ")+1));
                }
            }
            if (hm.size()==casos) {
                System.out.println("TODAS");
            }else if (hm.isEmpty()) {
                System.out.println("NINGUNA");
            }else{ 
                System.out.println(hm.get(hm.firstKey()));
            }
        }
    }
}
