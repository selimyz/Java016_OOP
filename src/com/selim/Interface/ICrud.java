package com.selim.Interface;

import java.util.Date;
import java.util.List;

// Create, Read, Update, Delete - CRUD
public interface ICrud {
    //Interface, programcının şözleşmesidir.
    // (Class) Sınıflar ile imzalanır
    // 1. İlgili method yazılır
    // 2. Method'un gözdesi yazılmaz

    void save(Object obje);

    void update(Object obje);

    void delete(Object obje);

    List<Object> findAll();

    Date getSaveDate();

    // public void toplam(int s1, int s2){
    // Method'un gövdesi - kod yazılan alan
    // }
}
