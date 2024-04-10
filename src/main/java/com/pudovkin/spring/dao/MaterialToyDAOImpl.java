package com.pudovkin.spring.dao;


import com.pudovkin.spring.entity.ManufacturerToy;
import com.pudovkin.spring.entity.MaterialToy;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MaterialToyDAOImpl implements MaterialToyDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<MaterialToy> getAllMaterialToy() {
        Session session = sessionFactory.getCurrentSession();
        List<MaterialToy> materialToys = session.createQuery("FROM MaterialToy ", MaterialToy.class).getResultList();
        return materialToys;
    }

    @Override
    public void seveMaterialToy(MaterialToy materialToy) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(materialToy);
    }

    @Override
    public MaterialToy getMaterialToy(int id) {
        Session session = sessionFactory.getCurrentSession();
        MaterialToy materialToy =session.get(MaterialToy.class, id);
        return materialToy;
    }

    @Override
    public void deleteMaterialToy(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<MaterialToy> query = session.createQuery("delete from MaterialToy where id =:materialToyId");
        query.setParameter("materialToyId", id);
        query.executeUpdate();
    }

    @Override
    public Map<String, String> getMapAllMaterialToy(){
        Session session = sessionFactory.getCurrentSession();
        List<MaterialToy> materialToys = session.createQuery("FROM MaterialToy ", MaterialToy.class).getResultList();
        Map<String, String> mapMaterialToys = new HashMap<>();
        for (MaterialToy materialToy: materialToys){
            mapMaterialToys.put(materialToy.getCategoryName(),materialToy.getCategoryName());
        }
        return mapMaterialToys;
    }

}




