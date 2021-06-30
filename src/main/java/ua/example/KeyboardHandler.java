package ua.example;

public class KeyboardHandler extends EventHandler {

    private static final String KEYBOARD = "keyboard";

    @Override
    protected boolean canHandle(Event event) {
        return KEYBOARD.equals(event.getSource());
    }

    @Override
    protected boolean doHandle(Event event) {
        return event.doEvent();
    }
}
