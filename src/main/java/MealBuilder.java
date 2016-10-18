
public class MealBuilder {

    public Meal preaperMeatMeal(){
        Meal meal = new Meal();
        meal.addItem(new MeatBurger());
        meal.addItem(new Coke());

        return meal;
    }

    public Meal preaperVegBurger(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Pepsi());

        return meal;
    }
}
