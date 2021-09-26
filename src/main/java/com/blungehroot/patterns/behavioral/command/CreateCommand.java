package com.blungehroot.patterns.behavioral.command;

public class CreateCommand implements Command {
    Game game;

    public CreateCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.create();
    }
}
