package com.selim.Constructor;

import java.util.Scanner;

public class MainStokTakip {

    public static void main(String[] args) {

        System.out.println("************************");
        System.out.println("*** E-TİCARET STOK *****");
        System.out.println("************************");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Ürün Adı......: ");
        String ad = sc.nextLine();
        System.out.print("Ürün Marka....: ");
        String marka = sc.nextLine();
        System.out.print("Ürün Model....: ");
        String model = sc.nextLine();
        sc = new Scanner(System.in);
        System.out.print("Ürün Fiyat....: ");
        double fiyat = sc.nextDouble();
        System.out.print("Ürün Adet.....: ");
        int adet = sc.nextInt();
        Urun urun = new Urun();// 1. kullanım
        urun.ad = ad;
        urun.fiyat = fiyat;
        urun.marka = marka;
        urun.model = model;
        urun.stok = adet;

        Urun urun2 = new Urun(ad, marka, model, fiyat, adet);// 2. kullanım

        System.out.println("ÜRÜN KAYIT EDİLDİ.");
    }
}
