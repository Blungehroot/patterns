package com.blungehroot.patterns.behavioral.command;

public class SaveCommand implements Command {
    Game game;

    public SaveCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.save();
    }
}
