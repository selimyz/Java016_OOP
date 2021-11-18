package com.selim.Pojo;

public class Musteri {
    // POJO
    // değişkenlerin erişime kapatılması gereklidir.

    private String ad;
    private String soyad;
    private String adres;
    private String telefon;

    public Musteri() {
    }

    public Musteri(String ad, String soyad, String adres, String telefon) {
        this.ad = ad;
        this.soyad = soyad;
        this.adres = adres;
        this.telefon = telefon;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
