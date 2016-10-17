import AbstractFactorypattern.AbstractFactory;
import FactoryPattern.Shape;
import FactoryPattern.ShapeFactory;
import Singleton.Singleton;

public class DesignPatterns {

    public static void main(String[] args){

        //useFactory();
        //useAbstractFactory();
        useSingleton();


    }

    private static void useSingleton() {
        //Singleton singleObject = new Singleton.Singleton(); <= it dosn't work!

        Singleton singleObject = Singleton.getSinleton();
        singleObject.msg();
    }

    public static void useAbstractFactory() {

        AbstractFactory shapeFactory = AbstractFactorypattern.FactoryProducer.getFactory("SHAPE");

        AbstractFactorypattern.Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        AbstractFactorypattern.Shape rect = shapeFactory.getShape("RECTANGLE");
        rect.draw();

        AbstractFactorypattern.Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

        AbstractFactory colorFactory = AbstractFactorypattern.FactoryProducer.getFactory("COLOUR");

        AbstractFactorypattern.Color blue = colorFactory.getColor("BLUE");
        blue.fill();

        AbstractFactorypattern.Color green = colorFactory.getColor("GREEN");
        green.fill();

        AbstractFactorypattern.Color red = colorFactory.getColor("RED");
        red.fill();

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
