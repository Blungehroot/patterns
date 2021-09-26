package com.blungehroot.patterns.behavioral.chain;

public class SimpleReportNotifier extends Notifier {

    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void writeMsg(String msg) {
        System.out.println("Notifying using simple report: " + msg);
    }
}
