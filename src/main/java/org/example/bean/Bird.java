package org.example.bean;

public class Bird {

    private Spider spider;

    public Bird(Spider spider) {
        this.spider = spider;
    }

    @Override
    public String toString() {
        return "птичку съел паук," + spider;
    }
}
