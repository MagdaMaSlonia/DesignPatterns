package Prototype;

public class Square extends Shapes {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Square");
    }
}