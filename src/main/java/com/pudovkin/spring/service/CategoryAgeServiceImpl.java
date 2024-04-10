package com.pudovkin.spring.service;

import com.pudovkin.spring.dao.CategoryAgeDAO;
import com.pudovkin.spring.entity.CategoryAgeToy;
import com.pudovkin.spring.entity.Toy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class CategoryAgeServiceImpl implements CategoryAgeService {
    @Autowired
    private CategoryAgeDAO categoryAgeDAO;

    @Override
    @Transactional
    public List<CategoryAgeToy> getAllCategoryAge() {
        return categoryAgeDAO.getAllCategoryAge();
    }

    @Override
    @Transactional
    public void saveCategoryAgeToy(CategoryAgeToy categoryAgeToy) {
        categoryAgeDAO.seveCategoryAge(categoryAgeToy);
    }

    @Override
    @Transactional
    public CategoryAgeToy getCategoryAgeToy(int id) {
        return categoryAgeDAO.getCategoryAge(id);
    }

    @Override
    @Transactional
    public void deleteCategoryAgeToy(int id) {
        categoryAgeDAO.deleteCategoryAge(id);
    }

    @Override
    @Transactional
    public Map<String, String> getMapAllCategoryAge() {
        return categoryAgeDAO.getMapAllCategoryAge();
    }
}
