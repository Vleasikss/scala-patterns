package ua.example;

public class Main {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        invoker.invoke(new PrintCommand("Command1"));
        invoker.invoke(new PrintCommand("Command2"));
    }
}
