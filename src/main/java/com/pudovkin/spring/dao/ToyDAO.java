package com.pudovkin.spring.dao;


import com.pudovkin.spring.entity.Toy;

import java.util.List;

public interface ToyDAO {
    public List<Toy> getAllToys();
    public void seveToy(Toy toy);
    public Toy getToy(int id);
    public void deleteToy(int id);
}
