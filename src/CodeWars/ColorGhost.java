package CodeWars;

/*
Create a class Ghost
Ghost objects are instantiated without any arguments.
Ghost objects are given a random color attribute of "white" or "yellow" or "purple" or "red" when instantiated
Ghost ghost = new Ghost();
ghost.getColor(); //=> "white" or "yellow" or "purple" or "red"
 */
public class ColorGhost {
    public static void main(String[] args) {
        
    }
}

class Ghost{
    private String color;
    
    public Ghost() {
        String[] colors = { "white", "yellow", "purple", "red" };
        int random = (int) (Math.random() * colors.length);
        this.color = colors[random];
    }

    public String getColor() {
        return this.color=color;
    }
    
}
