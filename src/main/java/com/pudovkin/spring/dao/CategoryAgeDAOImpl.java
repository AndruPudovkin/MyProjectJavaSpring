package com.pudovkin.spring.dao;

import com.pudovkin.spring.entity.CategoryAgeToy;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.query.Query;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CategoryAgeDAOImpl implements CategoryAgeDAO{
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<CategoryAgeToy> getAllCategoryAge() {
        Session session = sessionFactory.getCurrentSession();
        List<CategoryAgeToy> categoryAgeToys =session.createQuery("FROM CategoryAgeToy", CategoryAgeToy.class).getResultList();
        return categoryAgeToys;
    }

    @Override
    public void seveCategoryAge(CategoryAgeToy categoryAgeToy) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(categoryAgeToy);
    }

    @Override
    public CategoryAgeToy getCategoryAge(int id) {
        Session session = sessionFactory.getCurrentSession();
        CategoryAgeToy categoryAgeToy =session.get(CategoryAgeToy.class, id);
        return categoryAgeToy;
    }

    @Override
    public void deleteCategoryAge(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<CategoryAgeToy> query = session.createQuery("delete from CategoryAgeToy where id =:categoryAgeToyId");
        query.setParameter("categoryAgeToyId", id);
        query.executeUpdate();
    }

    @Override
    public Map<String, String> getMapAllCategoryAge() {
        Session session = sessionFactory.getCurrentSession();
        List<CategoryAgeToy> categoryAgeToys =session.createQuery("FROM CategoryAgeToy", CategoryAgeToy.class).getResultList();
        Map<String, String> mapCategoryAge = new HashMap<>();
        for (CategoryAgeToy categoryAgeToy: categoryAgeToys){
            mapCategoryAge.put(categoryAgeToy.getCategoryName(),categoryAgeToy.getCategoryName());
        }
        return mapCategoryAge;
    }

}

