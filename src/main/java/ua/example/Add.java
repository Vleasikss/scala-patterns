package ua.example;

public class Add implements Strategy {
    @Override
    public int compute(int a, int b) {
        return a + b;
    }
}
