package com.pro.investigacion.loteria.v2;

import java.util.Arrays;

public record Bonoloto(int day, int month, int year, Integer[] bet, int complementario, int reintegro) {

    @Override
    public String toString() {
        return "Bonoloto(" + day + ", " + month + ", " + year + ", " + Arrays.toString(bet) + ", " + complementario + ", " + reintegro + ')';
    }
}
