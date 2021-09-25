package com.blungehroot.patterns.structural.facade;

public class Mechanic {
    public void doWorkBeforeTimeOff(IssueList issueList) {
        if (issueList.isActiveWork()) {
            System.out.println("Mechanic fix issue");
        } else {
            System.out.println("Mechanic is drink coffee");
        }
    }

}
