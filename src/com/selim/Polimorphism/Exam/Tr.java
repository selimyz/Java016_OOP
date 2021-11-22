package com.selim.Polimorphism.Exam;

public class Tr implements Dil {

    @Override
    public String getHosgeldiniz() {
        return "Hoşgeldiniz";
    }

    @Override
    public String AnaSayfa() {
        return "Ana Sayfa";
    }

    @Override
    public String Hakkimizda() {
        return "Hakkımızda";
    }

    @Override
    public String Bilgisayar() {
        return "Bilgisayar";
    }

    @Override
    public String Giyim() {
        return "Giyim";
    }

    @Override
    public String Spor() {
        return null;
    }

    @Override
    public String Kişisel() {
        return null;
    }

    @Override
    public String DigerUrunler() {
        return null;
    }
}
