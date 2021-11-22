package com.selim.Polimorphism.Exam;

public class En implements Dil {

    @Override
    public String getHosgeldiniz() {
        return "Welcome";
    }

    @Override
    public String AnaSayfa() {
        return "Home Page";
    }

    @Override
    public String Hakkimizda() {
        return "About";
    }

    @Override
    public String Bilgisayar() {
        return "Computer";
    }

    @Override
    public String Giyim() {
        return "clothes";
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
