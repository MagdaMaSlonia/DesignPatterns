import AbstractFactorypattern.AbstractFactory;
import AdapterPattern.AudioPlayer;
import Builder.Meal;
import Builder.MealBuilder;
import FactoryPattern.Shape;
import FactoryPattern.ShapeFactory;
import Prototype.ShapeCash;
import Prototype.Shapes;
import Singleton.Singleton;


public class DesignPatterns {

    public static void main(String[] args){

        //useFactory();
        //useAbstractFactory();
        //useSingleton();
        //useBuilderPattern();
        //usePrototypePattern();
        useAdapter();


    }

    private static void useAdapter() {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }

    private static void usePrototypePattern() {

        ShapeCash.loadCache();

        Shapes clonedShape = ShapeCash.getShape("1");

        System.out.println("Prototype.Shapes : " + clonedShape.getType());

        Shapes clonedShape2 = ShapeCash.getShape("2");
        System.out.println("Prototype.Shapes : " + clonedShape2.getType());

        Shapes clonedShape3 = ShapeCash.getShape("3");
        System.out.println("Prototype.Shapes : " + clonedShape3.getType());

    }

    private static void useBuilderPattern() {

        MealBuilder meal = new MealBuilder();

        Meal vegMeal = meal.preaperVegBurger();

        System.out.println("Vege meal: ");
        vegMeal.getCost();
        vegMeal.showItems();

        Meal meatMeal = meal.preaperMeatMeal();

        System.out.println("Meat meal: ");
        meatMeal.getCost();
        meatMeal.showItems();

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
