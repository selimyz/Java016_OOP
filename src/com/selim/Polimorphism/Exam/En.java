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
}
