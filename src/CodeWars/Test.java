package CodeWars;

/*
 */
class Test{
    public static void main(String[] args) {
        //recursividad(10);
        System.out.println(factorial(10));
    }

    private static void recursividad(int i) {
        if (i < 1){
            System.out.println("Termine");
        }else {
            System.out.println(i);
            recursividad(i - 1);
        }
    }

    public static int factorial(int i){
        if (i < 0) return -1;
        if (i == 0) return 1;
        return i * factorial(i-1);
    }

}
