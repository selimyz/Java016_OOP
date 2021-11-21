package com.selim.Polimorphism;

public class Main {
    public static void main(String[] args) {
        // Çok Biçimlilik - Polimorphism

        KucukBas kb = new KucukBas();
        kb.HayvanlariBesleyin();
        Kumes km = new Kumes();
        km.HayvanlariBesleyin();
        BuyukBas bb = new BuyukBas();
        bb.HayvanlariBesleyin();
        //----------------------------
        Aga aga = new Aga();
        aga.HayvanlariBesleyin();
        aga = new KucukBas();
        aga.HayvanlariBesleyin();
        aga=new Kumes();
        aga.HayvanlariBesleyin();
        aga=new BuyukBas();
        aga.HayvanlariBesleyin();
    }
}