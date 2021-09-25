package com.blungehroot.patterns.structural.facade;

public class WorkFlow {
    Mechanic mechanic = new Mechanic();
    Work work = new Work();
    IssueList issueList = new IssueList();

    public void repairProblem() {
        work.doWork();
        issueList.startWork();
        mechanic.doWorkBeforeTimeOff(issueList);
    }
}
