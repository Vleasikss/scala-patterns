package ua.example;

public class MouseHandler extends EventHandler {

    private static final String MOUSE = "mouse";

    @Override
    protected boolean canHandle(Event event) {
        return MOUSE.equals(event.getSource());
    }

    @Override
    protected boolean doHandle(Event event) {
        return event.doEvent();
    }
}
