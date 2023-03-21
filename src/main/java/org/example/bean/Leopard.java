package org.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Leopard {
@Autowired
    @Override
    public String toString() {
        return "леопард живёт - поживает!";
    }
}
