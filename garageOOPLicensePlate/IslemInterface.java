package com.garageOOPLicensePlate;

import java.util.HashMap;

public interface IslemInterface {

    HashMap<Integer, Integer> aracAlan = new HashMap<>();
    HashMap<Integer, String> aracIsim = new HashMap<>();

    static void putItems(){
        aracAlan.put(1, 1);
        aracAlan.put(2, 1);
        aracAlan.put(3, 2);
        aracAlan.put(4, 3);
        aracAlan.put(5, 5);
        aracAlan.put(6, 8);

        aracIsim.put(1, "Bisiklet");
        aracIsim.put(2, "Motorsiklet");
        aracIsim.put(3, "Araba");
        aracIsim.put(4, "Kamyonet");
        aracIsim.put(5, "Otobüs");
        aracIsim.put(6, "Tır");
    }

    String islemSec(String islem, Garaj grj, int tip, String plaka);
}
