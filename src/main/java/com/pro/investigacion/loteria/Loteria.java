package com.pro.investigacion.loteria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Loteria {

    Random rand = new Random();
    public Loteria() {
    }

    public List<Integer> generaBonoloto() {
        ArrayList<Integer> resp = new ArrayList<>();

        int vcc = 0;
        while (vcc != 6) {
            //int v = (int) (Math.random() * 49 + 1);
            int v = rand.nextInt(1, 50);
            if (resp.contains(v)) continue;
            else resp.add(v);
            vcc++;
        }
        Collections.sort(resp);
        return resp;
    }

    public List<Integer> generaPrimitiva() {
        ArrayList<Integer> resp = new ArrayList<>();

        int vcc = 0;
        while (vcc != 6) {
            int v = (int) (Math.random() * 49 + 1);
            if (resp.contains(v)) continue;
            else resp.add(v);
            vcc++;
        }
        Collections.sort(resp);
        return resp;
    }

    public Integer compareTo(List<Integer> a, List<Integer> b) {
        Integer resp = 0;

        for (Integer i : a) {
            if (b.contains(i)) resp++;
        }

        return resp;
    }

}
