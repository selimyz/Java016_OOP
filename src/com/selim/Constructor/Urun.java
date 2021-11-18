package com.selim.Constructor;

public class Urun {
    String ad;
    String marka;
    String model;
    double fiyat;
    int stok;

    public Urun() {

    }

    public Urun(String ad, String marka, String model, double fiyat, int stok) {
        this.ad = ad;
        this.fiyat = fiyat;
        this.marka = marka;
        this.model = model;
        this.stok = stok;
    }

}
