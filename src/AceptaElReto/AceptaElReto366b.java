package AceptaElReto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
3
80 2
100 12
100 1
2
1 1
1 1
0

100 1
100 12
80 2

1 1
1 1

 */
public class AceptaElReto366b {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int numN;
        List<int[]> list;
        do {
            numN = sc.nextInt();
            if (numN != 0) {
                list = new ArrayList<>();
                for (int i = 0; i < numN; i++) {
                    int [] array= new int[2];
                    array[0]=sc.nextInt();
                    array[1]=sc.nextInt();
                    list.add(array);
                }
                list= list.stream().sorted((a, b) -> {
                            if (a[0] != b[0]){
                            return Integer.compare(b[0], a[0]);
                            }else return Integer.compare(a[1], b[1]);
                        }).collect(Collectors.toList());
                for (int[] is : list) {
                    System.out.println(is[0]+" "+is[1]);
                }
                System.out.println("");
            }
        } while (numN != 0);
    }
}

