package AceptaElReto;

public class AceptaElReto532 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        int casos, input;
        int[] array; 
        casos=sc.nextInt()*2;
        array = new int [casos];
        for (int i = 0; i < casos; i++) {
            input=sc.nextInt();
            array[i]=input;
        }
        for (int i = 0; i < casos/2; i++) {
            System.out.println(array[i+i+1]-array[i+i]);
        }
    }
}
