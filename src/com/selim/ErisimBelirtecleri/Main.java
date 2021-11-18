package com.selim.ErisimBelirtecleri;

import com.selim.ErisimBelirtecleri.OzelAlan.OzelKedicik;

public class Main {
    public static void main(String[] args) {

        // aynı paket içinde sınıflar bir birine erişebilirler
        // ancak bilinçli bir şekilde kapatılmamış olmak şartı ile
        // ayrı paket içindeki sınıflar bir birie erişebilirler
        // ancak her iki sınıfta en geniş kapsamı ile açık olma şartı vardır.
        // public - tüm yönleri ile;
        // bir değişkeni, bir sınıfı ya da method u her yerden erişime açar.
        // private - bir değişken, method ya da sınıf herkese kapatmak için kullanılır.
        // sınıf içi hariç hiç bir yerden erişim yapılmaz.
        // protected - paket içine açık paket dışına kapalı değişken oluşturur.
        // default - protected

        Kedi kedi = new Kedi();
        OzelKedicik ozelKedicik = new OzelKedicik();


    }
}
