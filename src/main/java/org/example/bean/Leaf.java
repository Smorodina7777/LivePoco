package org.example.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Leaf {

    private Bug bug;

    public Leaf(Bug bug) {
        this.bug = bug;
    }
@Autowired
    public void setBug(Bug bug) {
        this.bug = bug;
    }

    @Override
    public String toString() {
        return "Листик съел жучок," + bug.toString();
    }
}
