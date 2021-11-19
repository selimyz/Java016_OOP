package com.selim.Overloading;

public class Main {
    public static void main(String[] args) {
        KayitIslemleri kayit = new KayitIslemleri();

        Musteri musteri = new Musteri();
        Urun urun = new Urun();

        kayit.kaydet(musteri);
        kayit.kaydet(urun);
        kayit.kaydet("selim","yılmaz",1);
    }
}
