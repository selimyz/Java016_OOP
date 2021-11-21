package com.selim.Interface;

public class Main {
    public static void main(String[] args) {

        MusteriKayitIslemleri musteriKayitIslemleri = new MusteriKayitIslemleri();
        musteriKayitIslemleri.save("selim");
        Musteri musteri=new Musteri("selim","yılmaz","ankara");
        System.out.println(musteri.getAd());

    }
}
