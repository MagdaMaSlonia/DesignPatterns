package Singleton;

public class Singleton {

    public static Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getSinleton() {
        return instance;
    }

    public void msg(){
        System.out.println("My god it's not full of Singletons (only one!)");
    }
}
