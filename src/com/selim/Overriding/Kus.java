package com.selim.Overriding;

public class Kus extends Hayvanlar {

    // bir sınıf miras aldığı sınıftaki methodları kendi içerisinde tekrar kullanır
    // ve tanımlarsa miras alınan method ezilmiş değiştirilmiş olur.

    @Override
    public void hareketEt() {
        System.out.println("kuş uçtu");
    }
    @Override
    public void yemekYedir(){
        System.out.println("kuş yemlendi");
    }
}
