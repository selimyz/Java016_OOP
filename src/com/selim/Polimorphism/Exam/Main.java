package com.selim.Polimorphism.Exam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Internet sitesi - Global

        Scanner sc = new Scanner(System.in);
        System.out.print("Dil seçin (tr-en-de-ru-fr): ");
        String dilSec = sc.nextLine();
        Dil dil = null;
        switch (dilSec) {
            case "tr":
                dil = new Tr();
                break;
            case "en":
                dil = new En();
                break;
            case "de":
                dil = new De();
                break;
            case "ru":
                dil = new Ru();
                break;
            case "fr":
                dil = new Fr();
                break;
            default:
                dil = new En();
                break;
        }
        System.out.println("*********************************");
        System.out.println("******* " + dil.getHosgeldiniz() + " *******");
        System.out.println("*********************************");
        System.out.println();
        System.out.println(" | " + dil.AnaSayfa() + " | " + dil.Hakkimizda() + " | ");
        System.out.println();
        System.out.println(dil.Bilgisayar());
        System.out.println("----------");
        System.out.println("Giyim");
        System.out.println("----------");
        System.out.println("Spor");
        System.out.println("----------");
        System.out.println("Kişisel");
        System.out.println("----------");
        System.out.println("Diğer Ürünler");
    }
}
