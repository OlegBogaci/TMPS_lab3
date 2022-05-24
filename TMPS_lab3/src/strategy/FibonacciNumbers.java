package strategy;

public class FibonacciNumbers {

    private int limit;
    private AbstractStrategy strategy;

    public FibonacciNumbers(AbstractStrategy strategy) {
        this.strategy = strategy;
    }

    public void calculate() {
        strategy.calculate(limit);
    }

    public void setStrategy(AbstractStrategy strategy){
        this.strategy=strategy;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}