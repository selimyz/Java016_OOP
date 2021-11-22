package com.selim.Keywords.Static;

public class Main {
    public static void main(String[] args) {
        int sayi = 434;
        int s;
        System.out.println("Sayi: " + sayi);

        Kedi kedi1 = new Kedi();
        Kedi kedi2 = new Kedi();

        kedi1.ad = "mavi göz";
        kedi2.ad = "sinirli";

        Kedi.ad = "BAMBAŞKA BİR KEDİ";

        // Tüm tanımlarımızın kullanılabilmesi için bellekte adreslenmesi
        // ve o adresi işaret eden değişken adı tanımına ihtiyaç vardır.

        System.out.println("1. Kedi adı: " + kedi1.ad);
        System.out.println("2. Kedi adı: " + kedi2.ad);
    }
}
