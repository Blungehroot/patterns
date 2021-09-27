package com.blungehroot.patterns.behavioral.state;

public class DocumentState {
    public static void main(String[] args) {
        State state = new Draft();
        Document document = new Document();

        document.setState(state);

        for (int i = 0; i < 5; i++) {
            document.publish();
            document.changeState();
        }
    }
}
