package com.selim.Polimorphism.Exam;

public class Ru implements Dil{

    @Override
    public String getHosgeldiniz() {
        return "Добро пожаловать";
    }

    @Override
    public String AnaSayfa() {
        return "домашняя страница";
    }

    @Override
    public String Hakkimizda() {
        return "о нас";
    }
}
