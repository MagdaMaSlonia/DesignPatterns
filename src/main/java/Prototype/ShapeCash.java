package Prototype;

import java.util.HashMap;


public class ShapeCash {

    private static HashMap<String, Shapes> shapeMap = new HashMap<String, Shapes>();

    public static Shapes getShape(String id) {
        try {
            Shapes shape = shapeMap.get(id);
            return (Shapes) shape.clone();
        }
        catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void loadCache() {

        Shapes circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Shapes rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);

        Shapes square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(), square);

    }

}
