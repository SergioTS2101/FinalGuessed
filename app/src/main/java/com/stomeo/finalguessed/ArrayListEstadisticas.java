package com.stomeo.finalguessed;

import java.io.Serializable;

public class ArrayListEstadisticas implements Serializable {

    private final String opcion;

    public ArrayListEstadisticas(String opcion) {
        this.opcion = opcion;
    }

    public String getOpcion() {
        return opcion;
    }
}
