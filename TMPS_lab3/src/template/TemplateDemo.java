package template;

public class TemplateDemo {
    public static void main(String[] args) {
        System.out.println("Cook pasta:");

        DishTemplate pasta = new Pasta();
        pasta.cookDish();

        System.out.println("\nCook soup: ");

        DishTemplate soup = new Soup();
        soup.cookDish();
    }
}