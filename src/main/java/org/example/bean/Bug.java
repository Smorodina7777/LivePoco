package org.example.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class Bug {

    private Bird bird;
@Autowired
    public Bug(Bird bird) {
        this.bird = bird;
    }

    @Override
    public String toString() {
        return "жучка съела птичка," + bird.toString();
    }
}
