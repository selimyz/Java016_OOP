package com.selim.Interface;

import java.util.Date;
import java.util.List;

// Create, Read, Update, Delete - CRUD
public interface ICrud {

    void save(Object obje);
    void update(Object obje);
    void delete(Object obje);
    List<Object> findAll();
    Date getSaveDate();
}
