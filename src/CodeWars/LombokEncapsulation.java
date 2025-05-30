package CodeWars;

/*
We have to do the following modifications to properly encapsulate info:

make fields private
provide accessors to the internal fields ( setters/getters )
provide an empty constructor to support Java Beans specification
Add a constructor that can receive parameters for all of the fields
 */
public class LombokEncapsulation {
    
}
/*
import lombok.*;

@Data @AllArgsConstructor @NoArgsConstructor
public class EncapsulationDemo{
  private int number;
  private String stringValue;
  private Object anObject;
}
*/
class EncapsulationDemo{
  private int number;
  private String stringValue;
  private Object anObject;

    public EncapsulationDemo() {
    }

    public EncapsulationDemo(int number, String stringValue, Object anObject) {
        this.number = number;
        this.stringValue = stringValue;
        this.anObject = anObject;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public Object getAnObject() {
        return anObject;
    }

    public void setAnObject(Object anObject) {
        this.anObject = anObject;
    }
  
  
}