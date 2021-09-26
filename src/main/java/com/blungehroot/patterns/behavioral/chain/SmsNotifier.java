package com.blungehroot.patterns.behavioral.chain;

public class SmsNotifier extends Notifier {
    public SmsNotifier(int priority) {
        super(priority);
    }

    @Override
    public void writeMsg(String msg) {
        System.out.println("Sending sms to manager: " + msg);
    }
}
