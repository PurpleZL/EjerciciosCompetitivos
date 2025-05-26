package CodeWars;
/*
You have to do God's job. The creation method must return an array of length 2 
containing objects (representing Adam and Eve). The first object in the array 
should be an instance of the class Man. The second should be an instance of the
class Woman. Both objects have to be subclasses of Human. Your job is to 
implement the Human, Man and Woman classes.
 */
public class AdamAndEve {
    public static void main(String[] args) {
        
    }
    //array con 2 objetos, 1 objeto instancia de man y el otro de woman
    // los dos objetos tienen que ser subclases de human
    public static Human[] create() {
        Man man= new Man();
        Woman woman= new Woman();
        Human[] array= new Human[2];
        array[0]= man;
        array[1]= woman;
        return array;
    }
}

class Human{}
class Man extends Human{}
class Woman extends Human{}
