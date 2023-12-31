package com.pro.investigacion.loteria.v2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoteryTest {

    public static void main(String[] args) {

        List<List<Integer>> bets = List.of(
                List.of(8, 9, 2023, 12, 15, 31, 40, 47, 48, 30, 8),
                List.of(7, 9, 2023, 3, 17, 23, 36, 42, 46, 19, 5),
                List.of(6, 9, 2023, 15, 24, 29, 30, 35, 39, 42, 8),
                List.of(5, 9, 2023, 21, 24, 36, 43, 44, 48, 15, 4),
                List.of(4, 9, 2023, 13, 21, 32, 37, 39, 41, 10, 8),
                List.of(3, 9, 2023, 2, 9, 28, 38, 41, 49, 34, 1),
                List.of(2, 9, 2023, 3, 9, 13, 15, 24, 32, 35, 5),
                List.of(1, 9, 2023, 12, 14, 21, 28, 33, 35, 3, 3),
                List.of(31, 8, 2023, 6, 9, 13, 15, 28, 38, 47, 1),
                List.of(30, 8, 2023, 4, 5, 32, 35, 37, 48, 21, 5),
                List.of(29, 8, 2023, 12, 14, 15, 18, 42, 45, 41, 6),
                List.of(28, 8, 2023, 7, 9, 30, 36, 43, 45, 34, 1),
                List.of(27, 8, 2023, 11, 16, 28, 31, 46, 48, 15, 5),
                List.of(26, 8, 2023, 1, 6, 8, 12, 36, 41, 47, 4),
                List.of(25, 8, 2023, 2, 6, 11, 24, 25, 33, 49, 5),
                List.of(24, 8, 2023, 8, 20, 27, 39, 44, 45, 32, 2),
                List.of(23, 8, 2023, 8, 10, 15, 19, 21, 27, 13, 7),
                List.of(22, 8, 2023, 5, 13, 15, 23, 30, 48, 3, 3),
                List.of(21, 8, 2023, 6, 18, 26, 31, 43, 47, 41, 4),
                List.of(20, 8, 2023, 9, 13, 15, 16, 27, 38, 22, 5),
                List.of(10, 11, 2022, 5, 16, 20, 34, 40, 46, 41, 0),
                List.of(9, 11, 2022, 8, 13, 14, 20, 23, 30, 26, 6),
                List.of(8, 11, 2022, 1, 18, 20, 21, 46, 48, 33, 4),
                List.of(7, 11, 2022, 2, 11, 27, 36, 41, 47, 25, 3),
                List.of(6, 11, 2022, 2, 10, 21, 23, 28, 36, 35, 8),
                List.of(5, 11, 2022, 13, 19, 21, 30, 32, 38, 6, 2),
                List.of(4, 11, 2022, 7, 16, 18, 27, 35, 48, 39, 3),
                List.of(3, 11, 2022, 3, 6, 18, 22, 39, 46, 42, 3),
                List.of(2, 11, 2022, 8, 9, 24, 27, 46, 47, 30, 2),
                List.of(1, 11, 2022, 5, 14, 23, 32, 39, 46, 28, 6),
                List.of(31, 10, 2022, 4, 27, 29, 35, 45, 48, 31, 4),
                List.of(30, 10, 2022, 5, 13, 35, 38, 41, 47, 4, 2),
                List.of(29, 10, 2022, 4, 9, 12, 21, 23, 24, 47, 9),
                List.of(28, 10, 2022, 6, 17, 19, 34, 38, 45, 16, 7),
                List.of(27, 10, 2022, 3, 12, 14, 20, 24, 42, 7, 3),
                List.of(26, 10, 2022, 3, 7, 18, 22, 34, 46, 42, 7),
                List.of(25, 10, 2022, 5, 12, 13, 19, 32, 48, 40, 0),
                List.of(24, 10, 2022, 14, 29, 33, 35, 38, 46, 40, 8),
                List.of(23, 10, 2022, 20, 24, 28, 29, 31, 44, 25, 0),
                List.of(22, 10, 2022, 1, 8, 15, 21, 39, 42, 45, 9),
                List.of(21, 10, 2022, 8, 14, 19, 28, 38, 48, 49, 3),
                List.of(20, 10, 2022, 10, 24, 30, 34, 47, 48, 14, 7)
        );

        List<Bonoloto> listBonoloto = new ArrayList<>();

        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("clave1", 10);
        mapa.put("clave2", 20);
        mapa.put("clave3", 30);

        mapa.entrySet().forEach(System.out::println);

        //System.out.println(bets.toString());

        for (List<Integer> bet : bets) {

            Bonoloto bonoloto = new Bonoloto(bet.get(0), bet.get(1), bet.get(2),
                    new Integer[]{bet.get(3), bet.get(4), bet.get(5), bet.get(6), bet.get(7), bet.get(8)},
                    bet.get(9), bet.get(10));

            listBonoloto.add(bonoloto);
            System.out.println(bonoloto);
        }


    }
}