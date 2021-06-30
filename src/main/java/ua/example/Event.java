package ua.example;

import java.util.function.Function;

public class Event {

    private String source;

    public Event(String source) {
        this.source = source;
    }
    public Event() {

    }


    public boolean doEvent() {
        System.out.println("Do " + this.source);
        return true;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
