package Prototype;

public class Rectangle extends Shapes {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Recangle");
    }
}