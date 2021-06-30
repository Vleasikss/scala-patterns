package ua.example;

public class PrintCommand implements Runnable {

    private final String string;

    public PrintCommand(String string) {
        this.string = string;
    }

    @Override
    public void run() {
        System.out.println(string);
    }
}
