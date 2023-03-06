package org.example.bean;

public class Mangust {

    private Leopard leopard;

    public Mangust(Leopard leopard) {
        this.leopard = leopard;
    }

    @Override
    public String toString() {
        return "мангуста съел леопард," + leopard.toString();
    }
}
