package com.blungehroot.patterns.behavioral.state;

public class Document {
    State state;

    public void setState(State state) {
        this.state = state;
    }

    public void changeState() {
        if (state instanceof Draft) {
            setState(new Moderation());
        } else if (state instanceof Moderation) {
            setState(new Published());
        } else if (state instanceof Published) {
            setState(new Draft());
        }
    }

    public void publish() {
        state.publish();
    }
}
