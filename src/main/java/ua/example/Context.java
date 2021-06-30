package ua.example;

public class Context {
    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void use(int a, int b) {
        strategy.compute(a, b);
    }
}
