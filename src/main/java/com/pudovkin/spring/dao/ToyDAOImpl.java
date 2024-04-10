package com.pudovkin.spring.dao;


import com.pudovkin.spring.entity.Toy;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ToyDAOImpl implements ToyDAO{
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Toy> getAllToys() {
        Session session = sessionFactory.getCurrentSession();
        List<Toy> allToys = session.createQuery("FROM Toy", Toy.class).getResultList();
        return allToys;
    }

    @Override
    public void seveToy(Toy toy) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(toy);
    }

    @Override
    public Toy getToy(int id) {
        Session session = sessionFactory.getCurrentSession();
        Toy toy = session.get(Toy.class, id);
        return toy;
    }

    @Override
    public void deleteToy(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Toy> query = session.createQuery("delete from Toy where id =:toyId");
        query.setParameter("toyId",id);
        query.executeUpdate();
    }
}
