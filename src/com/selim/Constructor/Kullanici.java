package com.selim.Constructor;

import java.util.Date;

public class Kullanici {

    String ad;
    String soyad;
    String kullaniciadi;
    String sifre;
    String email;
    String telefon;
    String resim;
    String adres;
    Date dogumtarihi;

    public Kullanici() {

    }

    public Kullanici(String email,String sifre,String kullaniciadi) {
        this.email = email;
        this.kullaniciadi =kullaniciadi;
        this.sifre = sifre;
    }
}
