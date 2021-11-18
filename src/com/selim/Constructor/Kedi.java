package com.selim.Constructor;

public class Kedi {

    String ad;
    double kilo;
    double uzunluk;
    String renk;

    // Default Contructor- her sınıf içinde vardır yazılmak zorunda değildir.
    // Constructor sınıf adı ile aynı adı taşıyan geri dönüş tipi olmayan bir methodtur.
    // NOT: geri dönüş tipi kendi tipi.
    public Kedi() {
        System.out.println("Default Constructor Çalıştı");
        ad = "Minik Kedi";
        kilo = 1.25;
        uzunluk = 29;
        renk = "gri";
    }

    // Özelleştirilmiş constructor.
    public Kedi(String yeni_ad, double yeni_kilo) {
        System.out.println("Özelleştirilmiş Constructor Çalıştı");
        ad = yeni_ad;
        kilo = yeni_kilo;
        uzunluk = 51;
        renk = "Mavi";
    }

}
