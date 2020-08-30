package com.garageOOPLicensePlate;

public class Cikis implements IslemInterface {

    @Override
    public String islemSec(String islem, Garaj grj, int tip, String plaka) {

        if (grj.getGarajBoyut() != grj.getYer()) {
            int index = grj.aracBul(tip, plaka);

            if (index == -1)
                return ("---------- Bu araç garajda değil");

            else {
                grj.getAracList().remove(index);
                grj.setYer(grj.getYer() + aracAlan.get(tip));

                Haberci hbrAl = new Haberci();
                grj.cikar(hbrAl);

                grj.setAracList(grj.getAracList());
                grj.getAracListBefore().remove(index);

                return ("---------- Liste: " + grj.getAracList());
            }
        }
        else
            return ("---------- Garaj boş...");
    }
}
