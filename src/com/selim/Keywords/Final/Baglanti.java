package com.selim.Keywords.Final;

// final bir sınıfın önüne gelebilir
// bir sınıfın başka sınıflar tarafından miras alınmasını engeller - public final class Baglanti {}

public class Baglanti {

    // Değişmesini istemediğimiz sabit değerlerimizi korumaya almalıyız
    // final - bir değişkenin değişmezliğini garanti eder
    // final olarak tanımlanan değişkenler tamamen büyük harf ile kodlanır

    public final String IP = "http://192.168.1.2";
    public final double PI_SAYISI = 3.14;

    // methodların başına final anahtarlarını getirebilirsiniz.
    // miras alan sınıfta ilgili method'un override edilmesini engeller

    public void AdresDegistir(String ip) {
        //this.IP = ip;
    }
}
