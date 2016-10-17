package AbstractFactorypattern;


public class FactoryProducer {

    public static AbstractFactory getFactory(String indetity) {

        if(indetity.equalsIgnoreCase("COLOUR")) {

            return new ColorFactory();
        }else if(indetity.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        }

        return null;
    }
}
