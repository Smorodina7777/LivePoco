package org.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bird {
@Autowired
    private Spider spider;

    public Bird(Spider spider) {
        this.spider = spider;
    }

    @Override
    public String toString() {
        return "птичку съел паук," + spider;
    }
}
