package com.selim.Keywords.Static.Exam;

public class Main {
    public static void main(String[] args) {
        AnaSayfa as = new AnaSayfa();
        Bilgisayar bg = new Bilgisayar();
        Moda md = new Moda();
        as = new AnaSayfa();
        bg = new Bilgisayar();
        md = new Moda();

        Sayac sayac = new Sayac();
        System.out.println("Ana Sayfa   : " + sayac.anasayfa);
        System.out.println("Alt Sayfa   : " + sayac.altsayfalar);
        System.out.println("Tüm Gelenler: " + sayac.altsayfalar);
    }
}
