package com.pudovkin.spring.service;


import com.pudovkin.spring.dao.ToyDAO;
import com.pudovkin.spring.entity.Toy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ToyServiceImpl implements ToyService{
    @Autowired
    private ToyDAO toyDAO;
    @Override
    @Transactional
    public List<Toy> getAllToys() {
        return toyDAO.getAllToys();
    }

    @Override
    @Transactional
    public void saveToy(Toy toy) {
        toyDAO.seveToy(toy);
    }

    @Override
    @Transactional
    public Toy getToy(int id) {
        return toyDAO.getToy(id);
    }

    @Override
    @Transactional
    public void deleteToy(int id) {
        toyDAO.deleteToy(id);
    }

}
