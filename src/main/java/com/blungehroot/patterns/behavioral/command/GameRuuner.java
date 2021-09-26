package com.blungehroot.patterns.behavioral.command;

public class GameRuuner {
    public static void main(String[] args) {
        Game game = new Game();
        User user = new User(new CreateCommand(game), new SaveCommand(game), new OpenCommand(game), new MakeActionCommand(game));

        user.createGame();
        user.saveGame();
        user.openGame();
        user.makeActionInGame();
    }
}
