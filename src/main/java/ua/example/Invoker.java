package ua.example;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private final List<Runnable> history = new ArrayList<>();

    public void invoke(Runnable command) {
        command.run();
        history.add(command);
    }
}
