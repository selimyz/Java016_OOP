package com.selim.Polimorphism.Exam;

public class Fr implements Dil{

    @Override
    public String getHosgeldiniz() {
        return "Bienvenue";
    }

    @Override
    public String AnaSayfa() {
        return "page d'accueil";
    }

    @Override
    public String Hakkimizda() {
        return "à propos de nous";
    }

    @Override
    public String Bilgisayar() {
        return "ordinateur";
    }
}
