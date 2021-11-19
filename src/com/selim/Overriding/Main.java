package com.selim.Overriding;

public class Main {
    public static void main(String[] args) {

        // bir sınıf miras aldığı sınıftaki methodları kendi içerisinde tekrar kullanır
        // ve tanımlarsa miras alınan method ezilmiş değiştirilmiş olur.

        Kedi kedi = new Kedi();
        Balik balik = new Balik();
        Kus kus = new Kus();

        Hayvanlar hayvanlar = new Hayvanlar();
        hayvanlar.yemekYedir();

        kedi.hareketEt();
        balik.hareketEt();
        kus.hareketEt();
        kus.yemekYedir();

    }
}
