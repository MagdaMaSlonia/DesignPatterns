package Builder;


public class MeatBurger extends Burger {
    @Override
    public String name() {
        return "Meat Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
