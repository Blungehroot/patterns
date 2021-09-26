package com.blungehroot.patterns.behavioral.command;

public class User {
    Command create;
    Command save;
    Command open;
    Command makeAction;

    public User(Command create, Command save, Command open, Command makeAction) {
        this.create = create;
        this.save = save;
        this.open = open;
        this.makeAction = makeAction;
    }

    public void createGame() {
        create.execute();
    }

    public void saveGame() {
        save.execute();
    }

    public void openGame() {
        open.execute();
    }

    public void makeActionInGame() {
        makeAction.execute();
    }

}
