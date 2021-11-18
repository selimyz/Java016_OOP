package com.selim.OOPKonsepti;

public class Main {

    public static void main(String[] args) {


        // OOP - Object Oriented Programming
        // Nesne Yönelimli Programlama
        // Sınıftan yeni bir Nesne türetme işlemi
        // 1-Değişken tanımlama
        // 2-Değer atama - Nesne Yaratmak
        Kedi kedi1 = new Kedi();
        // 1-Değişken tanımlama
        // 2-Değer atama
        int sayi = 3;
        // - Kedi Class (kalıp) içindeki değerlere direkt erişim yapılamaz

        Ogrenci ahmet = new Ogrenci();
        Ogrenci bahar = new Ogrenci();
        Ogrenci temel = new Ogrenci();
        ahmet.ad = "Ahmet";
        ahmet.not1 = 65.6;
        ahmet.not2 = 80;
        //------------------
        bahar.ad = "Bahar";
        bahar.not1 = 87;
        bahar.not2 = 34;
        //------------------
        System.out.println("Öğrenci bilgileri");
        System.out.println("Ad.....: "+ ahmet.ad);
        System.out.println("Not1...: "+ ahmet.not1);
        System.out.println("Not2...: "+ ahmet.not2);
        System.out.println("Ort....: "+ ahmet.ortalama());
        System.out.println("---------------------");
        System.out.println("Ad.....: "+ bahar.ad);
        System.out.println("Not1...: "+ bahar.not1);
        System.out.println("Not2...: "+ bahar.not2);
        System.out.println("Ort....: "+ bahar.ortalama());
        System.out.println("---------------------");
        System.out.println("Ad.....: "+ temel.ad);
        System.out.println("Not1...: "+ temel.not1);
        System.out.println("Not2...: "+ temel.not2);
        System.out.println("Ort....: "+ temel.ortalama());

    }
}
