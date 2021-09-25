package com.blungehroot.patterns.structural.facade;

public class IssueList {
    private boolean activeWork;

    public boolean isActiveWork() {
        return activeWork;
    }

    public void startWork() {
        System.out.println("Work is active");
        activeWork = true;
    }

    public void finishWork() {
        System.out.println("Work is not active");
        activeWork = false;
    }
}
