package Prototype;

public class Circle extends Shapes {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}