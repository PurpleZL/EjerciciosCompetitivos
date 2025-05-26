package CodeWars;

/*
Code as fast as you can!

You need to make a constructor function with two methods (and only these two methods)
to return and increment a counter, but the counter should not be directly
accessible from outside the function.
 */
public class YouCantCodeUnderPressure2 {

}

class Counter {
    private int counter=0;

    public Counter() {
        
    }
    
    public int check(){
        return this.counter;
    }

    public int increment() {
        return this.counter++;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

}
