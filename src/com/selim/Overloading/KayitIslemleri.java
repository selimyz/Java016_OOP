package com.selim.Overloading;

public class KayitIslemleri {
    // 1. Kaydet()
    // 2. Duzenle()
    // Overloading -> methodların aşırı yüklenmesi

    public void kaydet(Urun urun) {
        System.out.println("ürün kayıt edldi");
    }

    public void kaydet(Personel personel) {
        System.out.println("Personel kayıt edldi");
    }

    public void kaydet(Maas maas) {
        System.out.println("Maas kayıt edldi");
    }

    public void kaydet(Musteri musteri) {
        System.out.println("Musteri kayıt edldi");
    }

    public void kaydet(Faturalar faturalar) {
        System.out.println("Faturalar kayıt edildi");
    }

    /**
     * Bu method ad ve soyad bilgisini alarak, sistemde kayıtlı olup
     * Aktivasyonu yapılmamış ya da hatalı yapılmış kişilerin Aktivasyon
     * durumlarını güncellemek için yazılmıştır.
     *
     * @param ad    - String var olan kullanıcı adı
     * @param soyad - String var olan kullanıcı soyadı
     * @param durum - Sistemde Aktif olan ya da olmayan kullanıcının durumunu giriniz:
     *              0 - Pasif kullanıcı
     *              1 - Aktif kullanıcı
     *              2 - Silinmiş kullanıcı
     *              3 - Kaydı dondurulmuş kullanıcı
     * @return - İşlem başarı ile tamamlanırsa true döner.
     */
    public boolean kaydet(String ad, String soyad, int durum) {
        return false;
    }

}
