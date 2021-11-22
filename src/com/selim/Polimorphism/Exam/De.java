package com.selim.Polimorphism.Exam;

public class De implements Dil {

    @Override
    public String getHosgeldiniz() {
        return "Willkommen";
    }

    @Override
    public String AnaSayfa() {
        return "Startseite";
    }

    @Override
    public String Hakkimizda() {
        return "über uns";
    }

    @Override
    public String Bilgisayar() {
        return "Rechner";
    }
}
