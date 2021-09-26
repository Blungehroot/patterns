package com.blungehroot.patterns.behavioral.command;

public class MakeActionCommand implements Command {
    Game game;

    public MakeActionCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.makeAction();
    }
}
