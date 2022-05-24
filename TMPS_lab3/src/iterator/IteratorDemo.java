package iterator;

import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {

        FruitBasket fruitBasket = new FruitBasket();

        fruitBasket.addFruit("Apple");
        fruitBasket.addFruit("Grape");
        fruitBasket.addFruit("Pineapple");
        fruitBasket.addFruit("Banana");

        Iterator<String> bikeIterator = fruitBasket.iterator();

		while (bikeIterator.hasNext()) {
			System.out.println(bikeIterator.next());
		}
        for (String bike : fruitBasket) {
            System.out.println(bike);
        }
        System.out.println(bikeIterator.next());

    }
}