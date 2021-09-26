package com.blungehroot.patterns.behavioral.chain;

public abstract class Notifier {
    private int priority;
    private Notifier nextNotifier;

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    public void notifyManager(String msg, int lvl) {
        if (lvl >= priority) {
            writeMsg(msg);
        } if (nextNotifier != null) {
            nextNotifier.notifyManager(msg, lvl);
        }
    }

    public abstract void writeMsg(String msg);
}
