package com.selim.Encapsulation;

import java.util.Date;

public class Sistem {
    // Erişim Belirteçleri
    // private, değişkene dışarıdan erişimi keser.

    private String baglanti = "Ankara";

    public void setBaglanti(String yeniBaglanti, String userName) {
        if (userName.equals("Admin")) {
            System.out.println(userName + " kişisi " + baglanti + " değerini"
                    + yeniBaglanti + " olarak değiştirdi");
            System.out.println("Saat: "+ new Date().getTime());
            baglanti=yeniBaglanti;
        } else
            System.out.println("Bilgi Değiştirilemedi. Yetkisiz Erişim");
    }

    public String getBaglanti(String userName) {
        if (userName.equals("Admin"))
            return baglanti;
        else
            return "Bilgi Alınamadı. Yetkisiz Erişim";
    }
}
