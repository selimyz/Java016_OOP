package com.selim.OOPKonsepti;

public class Kedi {
    // Değişkenler
    // Methodlar
    // İnner Class
    // Bir varlığı tanımlayan tüm özellikleri
    // değişken olarak nitelendiririz.
    // özel ismi - Property olarak geçer
    String ad;
    String cins;
    String tuyrengi;
    double uzunluk;
    double agirlik;
    String gozrengi;
    boolean acmi;
    boolean uyanikmi;
    boolean duruyormu;
    int hiz;


    // Varlığın yapabileceği aksiyonların tümü
    // method olarak tanımlanır.

    public void uyu() {
        uyanikmi= false;
    }

    public void yemekye() {
        acmi = false;
    }

    public void aciksin() {
        acmi = true;
    }

    public void kos() {
        hiz = 15;
    }
}
