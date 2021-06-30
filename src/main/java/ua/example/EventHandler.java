package ua.example;

public abstract class EventHandler {
    private EventHandler next;

    public void setNext(EventHandler next) {
        this.next = next;
    }

    public void handle(Event event) {
        if (canHandle(event)) {
            doHandle(event);
            return;
        }
        if (next != null) {
            next.handle(event);
        }
    }

    protected abstract boolean canHandle(Event event);

    protected abstract boolean doHandle(Event event);
}
