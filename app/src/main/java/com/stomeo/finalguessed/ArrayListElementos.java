package com.stomeo.finalguessed;

import java.io.Serializable;

public class ArrayListElementos implements Serializable {
    private String opcion;

    public ArrayListElementos(String opcion) {
        this.opcion = opcion;
    }

    public String getOpcion() {
        return opcion;
    }

}
