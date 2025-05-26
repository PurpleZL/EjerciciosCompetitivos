package CodeWars;
import java.util.*;
/*
 */
public class GenericInheritance {
    
}


class ShapeUtilities {
    public static double sumAllAreas(List<? extends Shape> shapes) {
        double totalArea = 0.0;
        for (Shape shape : shapes)
            totalArea += shape.getArea();
        return totalArea;
    }
}
abstract class Shape {
    public abstract double getArea();
}