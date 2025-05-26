package AceptaElReto;

import java.util.ArrayList;
import java.util.Collections;

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
public class AceptaElReto366 {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int numN;
        ArrayList list;
        do {
            numN = sc.nextInt();
            if (numN != 0) {
                list = new ArrayList();
                for (int i = 0; i < numN; i++) {
                    Nino datos=new Nino(sc.nextInt(), sc.nextInt());
                    list.add(datos);
                }
                Collections.sort(list);
                for (Object object : list) {
                    System.out.println(object);
                }
                System.out.println("");
            }
        } while (numN != 0);
    }
}

class Nino implements Comparable<Nino>{
    int puntuacion;
    int peso;

    @Override
    public String toString() {
        return puntuacion+" "+peso;
    }
    
    public Nino(int puntuacion, int peso) {
        this.puntuacion = puntuacion;
        this.peso = peso;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public int compareTo(Nino o) {
        if (this.puntuacion != o.puntuacion) {
            return Integer.compare(o.puntuacion, this.puntuacion);
        }
        return Integer.compare(this.peso, o.peso);
    }
}
