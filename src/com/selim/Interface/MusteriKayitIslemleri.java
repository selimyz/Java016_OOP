package com.selim.Interface;

import java.util.Date;
import java.util.List;

public class MusteriKayitIslemleri implements ICrud{

    @Override
    public void save(Object o) {
        System.out.println("Müşteri Kayıt Edildi");
    }

    @Override
    public void update(Object o) {
        System.out.println("Müşteri kayıtları değiştirildi");
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Object> findAll() {
        return null;
    }

    @Override
    public Date getSaveDate() {
        return null;
    }
}
