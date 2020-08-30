package com.garageOOPLicensePlate;

import static com.garageOOPLicensePlate.IslemInterface.putItems;

public class Islem {
    public static String islemSec(IslemInterface iI, String islem, Garaj grj, int tip, String plaka){
        putItems();

        return iI.islemSec(islem, grj, tip, plaka);
    }
}
