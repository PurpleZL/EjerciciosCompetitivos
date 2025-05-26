package AceptaElReto;

import java.util.HashMap;

/*
11
Felipe Carlos Felipe Felipe Felipe Carlos Felipe Carlos Alfonso Alfonso JuanCarlos
3
Felipe Leonor Felipe
12
Carlos Isabel Carlos Jorge Jorge Jorge Jorge Guillermo Victoria Jorge Jorge Isabel
3
Carlos Guillermo Jorge
0

6
1
7

3
2
7

 */
public class AceptaElReto214b {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int casos = -1;
        String reyes;
        HashMap<String, Integer> orden;
        do {
            casos = sc.nextInt();
            sc.nextLine();
            if (casos!=0) {
                orden=new HashMap<>();
                for (int i = 0; i < casos; i++) {
                    reyes=sc.nextLine();
                    if (orden.containsKey(reyes)) {
                        orden.put(reyes, 1);
                    }else{
                        orden.replace(reyes, orden.get(reyes)+1);
                    }
                }
                casos=sc.nextInt();
                sc.nextLine();
                for (int i = 0; i < casos; i++) {
                    reyes=sc.nextLine();
                    if (orden.containsKey(reyes)) {
                        System.out.println(orden.get(reyes)+1);
                    }else System.out.println(1);
                }
                System.out.println("");
            }
        } while (casos != 0);
    }
}
