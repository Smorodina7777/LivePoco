package org.example.bean;

import lombok.Data;

public class Leaf {

    private Bug bug;

    public Leaf(Bug bug) {
        this.bug = bug;
    }

    @Override
    public String toString() {
        return "Листик съел жучок," + bug.toString();
    }
}
