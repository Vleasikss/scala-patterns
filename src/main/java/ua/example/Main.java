package ua.example;

import java.util.List;

public class Main {

    private static final List<Event> events;

    static {
        events = List.of(
          new Event("keyboard"),
          new Event("mouse"));
    }

    public static void main(String[] args) {
        MouseHandler mainHandler = new MouseHandler();
        KeyboardHandler additionalHandler = new KeyboardHandler();
        mainHandler.setNext(additionalHandler);

        events.forEach(mainHandler::handle);
    }
}
