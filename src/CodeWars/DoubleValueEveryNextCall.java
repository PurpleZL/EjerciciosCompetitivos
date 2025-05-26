package CodeWars;

/*
This kata is about static method that should return different values.

On the first call it must be 1, on the second and others - it must be a double from previous value.

Look tests for more examples, good luck :)
 */
public class DoubleValueEveryNextCall {

}

class A {
    static int counter=0;
    public static int getNumber() {
        if (counter==0) {
            return counter+=1;
        }else return counter+=counter;
    }
}
