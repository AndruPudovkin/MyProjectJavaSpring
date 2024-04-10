package com.pudovkin.spring.service;


import com.pudovkin.spring.dao.CategoryToyDAO;
import com.pudovkin.spring.entity.CategoryToy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class CategoryToyServiceImpl implements CategoryToyService{
    @Autowired
    private CategoryToyDAO categoryToyDAO;

    @Override
    @Transactional
    public List<CategoryToy> getAllCategoryToy() {
        return categoryToyDAO.getAllCategoryToy();
    }

    @Override
    @Transactional
    public void saveCategoryToy(CategoryToy categoryToy) {
        categoryToyDAO.seveCategory(categoryToy);
    }

    @Override
    @Transactional
    public CategoryToy getCategoryToy(int id) {
        return categoryToyDAO.getCategory(id);
    }

    @Override
    @Transactional
    public void deleteCategoryToy(int id) {
        categoryToyDAO.deleteCategory(id);
    }

    @Override
    @Transactional
    public Map<String, String> getMapAllCategory() {
        return categoryToyDAO.getMapAllCategory();
    }
}
