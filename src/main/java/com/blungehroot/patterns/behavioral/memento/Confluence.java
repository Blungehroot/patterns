package com.blungehroot.patterns.behavioral.memento;

public class Confluence {
    private Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}
