package com.blungehroot.patterns.behavioral.chain;

public class EmailNotifier extends Notifier {
    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void writeMsg(String msg) {
        System.out.println("Sending email: " + msg);
    }
}
