package ua.example;

public class Multiply implements Strategy {
    @Override
    public int compute(int a, int b) {
        return a * b;
    }
}
