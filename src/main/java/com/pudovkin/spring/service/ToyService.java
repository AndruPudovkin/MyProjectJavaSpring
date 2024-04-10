package com.pudovkin.spring.service;



import com.pudovkin.spring.entity.Toy;

import java.util.List;

public interface ToyService {
    public List<Toy> getAllToys();
    public void saveToy(Toy toy);
    public Toy getToy( int id);
    public void deleteToy(int id);
}
