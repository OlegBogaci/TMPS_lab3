package template;

public class Soup extends DishTemplate {
    @Override
    public void prepareIngredients() {
        System.out.println("Water, meat, rice and pepper ready");
    }

    @Override
    public void combineIngredients() {
        System.out.println("Boil water and add all ingredients");
    }

    @Override
    public void finishDish() {
        System.out.println("Green and spices added");
    }
}