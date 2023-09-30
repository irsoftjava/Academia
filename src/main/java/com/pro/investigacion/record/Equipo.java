package com.pro.investigacion.record;

public record Equipo(Integer id, String nombre) {

    // Constructor de Equipo
    public Equipo() {
        this(0, "");
    }
}
