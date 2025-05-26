package AceptaElReto;

public class AceptaElReto140 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        int numero, suma=0;
        String string;
        char[] array;
        do {
            numero=sc.nextInt();
            if (numero>=0) {
                string=Integer.toString(numero);
                array=string.toCharArray();
                
                for (int i = 0; i < array.length; i++) {
                    suma += (Character.getNumericValue(array[i]));
                    if (i==array.length-1) {
                        System.out.print(array[i]+" = "+suma);
                    }else{System.out.print(array[i]+" + ");}
                }
                System.out.println("");
                suma=0;
            }   
            
        } while (numero>=0);
    }
}
