package com.selim.Interface;

import java.util.Date;
import java.util.List;

public interface ICrud {
    // Create, Read, Update, Delete - CRUD
    // Interface, programcının şözleşmesidir.
    // (Class) Sınıflar ile imzalanır
    // 1. İlgili method yazılır
    // 2. Method'un gözdesi yazılmaz

    void save(Object o);

    void update(Object o);

    void delete(int id);

    List<Object> findAll();

    Date getSaveDate();

    // public void toplam(int s1, int s2) {
    // Method'un gövdesi - kod yazılan alan
    // }
}
