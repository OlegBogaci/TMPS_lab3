package iterator;

import java.util.Iterator;

public class FruitBasket implements Iterable<String> {

    private String[] basket;
    private int index;

    public FruitBasket() {
        basket = new String[10];
        index = 0;
    }

    public void addFruit(String fruit) {
        if (index == basket.length) {
            String[] bigBasket = new String[basket.length + 5];
            System.arraycopy(basket, 0, bigBasket, 0, basket.length);
            basket = bigBasket;
        }

        basket[index] = fruit;
        index++;
    }

    public Iterator<String> iterator() {
        return new Iterator<>() {

            private int currentIndex = 0;

            public boolean hasNext() {
                return currentIndex < basket.length && basket[currentIndex] != null;
            }

            public String next() {
                return basket[currentIndex++];
            }
        };
    }
}