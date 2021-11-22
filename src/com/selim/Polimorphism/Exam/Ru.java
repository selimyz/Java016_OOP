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

    @Override
    public String Bilgisayar() {
        return "компьютер";
    }

    @Override
    public String Giyim() {
        return "одежда";
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
