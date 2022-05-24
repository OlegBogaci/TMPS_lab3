package template;

public abstract class DishTemplate {

    public boolean extraSalt;

    public abstract void prepareIngredients();

    public abstract void combineIngredients();

    public abstract void finishDish();

    public  void serveDish(){
        System.out.println("Dish served to customer");
    }

    public final void addSalt() {
        System.out.println("Salt added");
    }

    public final void cookDish() {
        prepareIngredients();
        combineIngredients();
        if (extraSalt)
            addSalt();
        finishDish();
        serveDish();
    }


}