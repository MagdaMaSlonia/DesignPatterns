package AbstractFactorypattern;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {

        if (color == null) {
            return null;
        }

        if(color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        } else if(color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if(color.equalsIgnoreCase("RED")) {
            return new Red();
        } else

            return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
