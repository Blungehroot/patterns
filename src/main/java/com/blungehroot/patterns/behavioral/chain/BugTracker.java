package com.blungehroot.patterns.behavioral.chain;

public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SmsNotifier(Priority.CRITICAL);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("All is fine", Priority.ROUTINE);
        reportNotifier.notifyManager("Required assistant", Priority.IMPORTANT);
        reportNotifier.notifyManager("Client have big trouble, need fast fix issue", Priority.CRITICAL);
    }
}
