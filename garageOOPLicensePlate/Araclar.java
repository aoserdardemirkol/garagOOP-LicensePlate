package com.garageOOPLicensePlate;

public class Araclar {
    private int tip;
    private String ad;
    private int alan;
    private String plaka;

    public Araclar(int tip, String ad, int alan, String plaka) {
        this.tip = tip;
        this.ad = ad;
        this.alan = alan;
        this.plaka = plaka;
    }

    public int getTip() {
        return tip;
    }
    public void setTip(int tip) {
        this.tip = tip;
    }

    public String getAd() {
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getAlan() {
        return alan;
    }
    public void setAlan(int alan) {
        this.alan = alan;
    }

    public String getPlaka() {
        return plaka;
    }
    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public String toString() {
        return "Araç Tipi: " + ad + " - Kapladığı Alan: " + alan + " - Plaka: " + plaka;
    }
}