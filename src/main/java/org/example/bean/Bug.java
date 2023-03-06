package org.example.bean;

import lombok.Data;

@Data
public class Bug {

    private Bird bird;

    public Bug(Bird bird) {
        this.bird = bird;
    }

    @Override
    public String toString() {
        return "жучка съела птичка," + bird.toString();
    }
}
