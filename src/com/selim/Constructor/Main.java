package com.selim.Constructor;

public class Main {
    public static void main(String[] args) {

        // Yapıcı - Kurucu Method

        Kedi kedi = new Kedi();
        System.out.println("ad.......: " + kedi.ad);
        System.out.println("Kilo.....: " + kedi.kilo);
        System.out.println("Uzunluk..: " + kedi.uzunluk);
        System.out.println("Renk.....: " + kedi.renk);
        kedi.kilo = 5;
        System.out.println("Kilo.....: " + kedi.kilo);
        System.out.println("------------------------------------");
        Kedi kedi2 = new Kedi("Maviş", 2.5);
        System.out.println("ad.......: " + kedi2.ad);
        System.out.println("Kilo.....: " + kedi2.kilo);
        System.out.println("Uzunluk..: " + kedi2.uzunluk);
        System.out.println("Renk.....: " + kedi2.renk);


    }

    static int ekranaYaz() {
        System.out.println("Selam arkadaşlar");
        return 120;

    }
}
