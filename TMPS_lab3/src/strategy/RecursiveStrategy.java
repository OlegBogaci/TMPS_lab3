package strategy;

public class RecursiveStrategy extends AbstractStrategy {

    public void calculate(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci(i));
        }
    }

    public int fibonacci(int n)  {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}