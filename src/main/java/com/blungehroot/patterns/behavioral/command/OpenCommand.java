package com.blungehroot.patterns.behavioral.command;

public class OpenCommand implements Command {
    Game game;

    public OpenCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.open();
    }
}
