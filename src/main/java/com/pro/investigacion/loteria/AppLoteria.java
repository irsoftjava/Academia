package com.pro.investigacion.loteria;

import java.util.ArrayList;
import java.util.List;


/*
        1, 2, 3, 4, 5, 6
        1, 2, 3, 4, 7, 8                - 1
        1, 2, 5, 6, 7, 8
        9, 10, 11, 12, 13, 14           - 2
        9, 10, 11, 15, 16, 17
        12, 13, 14, 15, 16, 17          - 3
        18, 19, 20, 21, 26, 27
        18, 19, 22, 23, 30, 31          - 4
        18, 19, 24, 25, 28, 29
        20, 21, 22, 23, 28, 29          - 5
        20, 21, 24, 25, 30, 31
        22, 23, 24, 25, 26, 27          - 6
        26, 27, 28, 29, 30, 31
        32, 33, 34, 35, 40, 41          - 7
        32, 33, 36, 37, 44, 45
        32, 33, 38, 39, 42, 43          - 8
        34, 35, 36, 37, 42, 43
        34, 35, 38, 39, 44, 45          - 9
        36, 37, 38, 39, 40, 41
        40, 41, 42, 43, 44, 45          - 10
        46, 47, 48, 49, 54, 55
*
* */

public class AppLoteria {

    static final List<List<Integer>> apuestas = List.of(
            List.of(1, 2, 3, 4, 5, 6),
            List.of(1, 2, 3, 4, 7, 8),
            List.of(1, 2, 5, 6, 7, 8),
            List.of(9, 10, 11, 12, 13, 14),
            List.of(9, 10, 11, 15, 16, 17),
            List.of(12, 13, 14, 15, 16, 17),
            List.of(18, 19, 20, 21, 26, 27),
            List.of(18, 19, 22, 23, 30, 31),
            List.of(18, 19, 24, 25, 28, 29),
            List.of(20, 21, 22, 23, 28, 29),
            List.of(20, 21, 24, 25, 30, 31),
            List.of(22, 23, 24, 25, 26, 27),
            List.of(26, 27, 28, 29, 30, 31),
            List.of(32, 33, 34, 35, 40, 41),
            List.of(32, 33, 36, 37, 44, 45),
            List.of(34, 35, 36, 37, 42, 43),
            List.of(34, 35, 38, 39, 44, 45),
            List.of(36, 37, 38, 39, 40, 4),
            List.of(40, 41, 42, 43, 44, 45),
            List.of(41, 43, 46, 47, 48, 49)
    );
    public static void main(String[] args) {

        Loteria loteria = new Loteria();

        int aciertos = 0;
        int dineroInvertido = 0;
        int dineroGanado = 0;
        for (int i = 0; i < 30; i++) {
            // genera una combinación
            List<Integer> tiradas = loteria.generaBonoloto();
            System.out.println("Día #" + (i+1) + " Apuesta: "+ tiradas);

            int c = 0;
            dineroInvertido += 10;
            // recorro mis apuestas
            for (List<Integer> apuesta : apuestas) {
                // comparo la combinación con cada una de mis apuestas
                aciertos = loteria.compareTo(tiradas, apuesta);

                // si los aciertos son mayores a 3, los cuento y los imprimo
                if (aciertos >= 3) {
                    c++;
                    System.out.println("\t\t\t\t" + c + " -> " + apuesta + " -> " + aciertos);
                }
            }

        }
    }
}
