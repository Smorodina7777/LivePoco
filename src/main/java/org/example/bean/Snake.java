package org.example.bean;

import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Setter
public class Snake {
    private Mangust mangust;

    public Snake(Mangust mangust) {
        this.mangust = mangust;
    }

    @Override
    public String toString() {
        return "змею съел мангуст," + mangust;
    }
}
