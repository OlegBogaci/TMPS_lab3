package strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        FibonacciNumbers fibonacciNumbers = new FibonacciNumbers(new StreamStrategy());

        fibonacciNumbers.setLimit(10);
        fibonacciNumbers.calculate();

        fibonacciNumbers.setStrategy(new ForStrategy());
        fibonacciNumbers.calculate();

        fibonacciNumbers.setStrategy(new RecursiveStrategy());
        fibonacciNumbers.calculate();

    }
}