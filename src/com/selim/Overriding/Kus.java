package com.selim.Overriding;

public class Kus extends Hayvanlar {

    @Override
    public void hareketEt() {
        System.out.println("kuş uçtu");
    }
    @Override
    public void yemekYedir(){
        System.out.println("kuş yemlendi");
    }
}
