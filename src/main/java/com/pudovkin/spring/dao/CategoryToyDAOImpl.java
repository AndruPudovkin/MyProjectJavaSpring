package com.pudovkin.spring.dao;

import com.pudovkin.spring.entity.CategoryAgeToy;
import com.pudovkin.spring.entity.CategoryToy;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CategoryToyDAOImpl implements CategoryToyDAO{
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<CategoryToy> getAllCategoryToy() {
        Session session = sessionFactory.getCurrentSession();
        List<CategoryToy> categoryToys = session.createQuery("FROM CategoryToy", CategoryToy.class).getResultList();
        return categoryToys;
    }

    @Override
    public void seveCategory(CategoryToy categoryToy) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(categoryToy);
    }

    @Override
    public CategoryToy getCategory(int id) {
        Session session = sessionFactory.getCurrentSession();
        CategoryToy categoryToy =session.get(CategoryToy.class, id);
        return categoryToy;
    }

    @Override
    public void deleteCategory(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<CategoryToy> query = session.createQuery("delete from CategoryToy where id =:categoryToyId");
        query.setParameter("categoryToyId", id);
        query.executeUpdate();
    }

    @Override
    public Map<String, String> getMapAllCategory() {
        Session session = sessionFactory.getCurrentSession();
        List<CategoryToy> categoryToys = session.createQuery("FROM CategoryToy", CategoryToy.class).getResultList();
        Map<String, String> mapCategory = new HashMap<>();
        for (CategoryToy categoryToy: categoryToys){
            mapCategory.put(categoryToy.getCategoryName(),categoryToy.getCategoryName());
        }
        return mapCategory;
    }

}
