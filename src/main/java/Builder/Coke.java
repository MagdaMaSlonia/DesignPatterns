package Builder;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke Cola";
    }

    @Override
    public float price() {
        return 5.0f;
    }
}
