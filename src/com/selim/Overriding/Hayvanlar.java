package com.selim.Overriding;

public class Hayvanlar {
    int uzunluk;
    int agirlik;
    String ad;
    boolean acmi;

    public void hareketEt() {
        System.out.println("hayvan hareket etti");
    }

    public void yemekYedir() {
        acmi = false;
        System.out.println("hayvan yemek yedi");
    }
}
