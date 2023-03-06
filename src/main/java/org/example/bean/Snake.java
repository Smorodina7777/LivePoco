package org.example.bean;

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
