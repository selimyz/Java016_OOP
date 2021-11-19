package com.selim.Encapsulation;

public class Main {
    public static void main(String[] args) {
        // Encapsulation - Kapsülleme

        Sistem sistem = new Sistem();

        System.out.println(sistem.getBaglanti("Admin"));

        sistem.setBaglanti("İzmir","Admin");
        System.out.println(sistem.getBaglanti("Admin"));

    }
}
