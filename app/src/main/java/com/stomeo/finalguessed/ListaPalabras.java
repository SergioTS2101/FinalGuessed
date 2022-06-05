package com.stomeo.finalguessed;

public class ListaPalabras {

    private final String palabra;
    private final int id;

    public ListaPalabras(String palabra, int id) {
        this.palabra = palabra;
        this.id = id;
    }

    public String getPalabra() {
        return palabra;
    }

    public int getId() {
        return id;
    }
}
