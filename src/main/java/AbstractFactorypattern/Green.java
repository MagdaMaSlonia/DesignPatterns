package AbstractFactorypattern;

public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Koloruje Greenem");
    }
}