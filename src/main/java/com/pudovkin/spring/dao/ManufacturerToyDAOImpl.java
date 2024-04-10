package com.pudovkin.spring.dao;

import com.pudovkin.spring.entity.CategoryToy;
import com.pudovkin.spring.entity.ManufacturerToy;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ManufacturerToyDAOImpl implements ManufacturerToyDAO{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<ManufacturerToy> getAllManufacturerToy() {
        Session session = sessionFactory.getCurrentSession();
        List<ManufacturerToy> manufacturerToys = session.createQuery("FROM ManufacturerToy", ManufacturerToy.class).getResultList();
        return manufacturerToys;
    }

    @Override
    public void seveManufacturerToy(ManufacturerToy manufacturerToy) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(manufacturerToy);
    }

    @Override
    public ManufacturerToy getManufacturerToy(int id) {
        Session session = sessionFactory.getCurrentSession();
        ManufacturerToy manufacturerToy =session.get(ManufacturerToy.class, id);
        return manufacturerToy;
    }

    @Override
    public void deleteManufacturerToy(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<ManufacturerToy> query = session.createQuery("delete from ManufacturerToy where id =:manufacturerToyId");
        query.setParameter("manufacturerToyId", id);
        query.executeUpdate();
    }

    @Override
    public Map<String, String> getMapAllManufacturerToy() {
        Session session = sessionFactory.getCurrentSession();
        List<ManufacturerToy> manufacturerToys = session.createQuery("FROM ManufacturerToy", ManufacturerToy.class).getResultList();
        Map<String, String> mapManufacturerToys = new HashMap<>();
        for (ManufacturerToy manufacturerToy: manufacturerToys){
            mapManufacturerToys.put(manufacturerToy.getCategoryName(),manufacturerToy.getCategoryName());
        }
        return mapManufacturerToys;
    }
}
