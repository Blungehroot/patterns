package com.blungehroot.patterns.behavioral.memento;

public class SaveTopicRunner {
    public static void main(String[] args) throws InterruptedException {
        Topic topic = new Topic();
        Confluence confluence = new Confluence();

        System.out.println("Create new topic v1.0");
        topic.setVersionAndDate("Ver. 1.0");

        System.out.println(topic);

        System.out.println("Save current topic version to confluence...");

        confluence.setSave(topic.saveTopic());

        System.out.println("Update topic die to new requirements");
        System.out.println("Update topic");
        Thread.sleep(5000);
        topic.setVersionAndDate("Ver. 1.1");

        System.out.println(topic);

        System.out.println("Wrong requirements");

        System.out.println("Reload topic");

        topic.load(confluence.getSave());

        System.out.println("Rollback topic to previous version");
        System.out.println(topic);
    }
}
