package com.selim.Interface;

import java.util.Date;
import java.util.List;

public class MusteriKayitIslemleri implements ICrud{

    @Override
    public void save(Object obje) {
        System.out.println("müşteri kayıt edildi.");

    }

    @Override
    public void update(Object obje) {

    }

    @Override
    public void delete(Object obje) {

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
