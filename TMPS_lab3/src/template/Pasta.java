package template;

public class Pasta extends DishTemplate {
    @Override
    public void prepareIngredients() {
          System.out.println("Pasta and tomato sauce are ready");
    }

    @Override
    public void combineIngredients() {
        System.out.println("Added sauce to cooked pasta");
    }

    @Override
    public void finishDish() {
        System.out.println("Green added");
    }
}