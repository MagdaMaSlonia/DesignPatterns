import FactoryPattern.Shape;
import FactoryPattern.ShapeFactory;

public class DesignPatterns {

    public static void main(String[] args){

        useFactory();

    }

    private static void useFactory() {
        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.getShape("CIRCLE");
        circle.draw();

        Shape rectangle = factory.getShape("RECTANGLE");
        rectangle.draw();

        Shape square = factory.getShape("SQUARE");
        square.draw();
    }
}
