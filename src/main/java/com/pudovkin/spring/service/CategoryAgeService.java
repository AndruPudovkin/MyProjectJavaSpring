package com.pudovkin.spring.service;

import com.pudovkin.spring.entity.CategoryAgeToy;
import com.pudovkin.spring.entity.Toy;

import java.util.List;
import java.util.Map;

public interface CategoryAgeService {
    public List<CategoryAgeToy> getAllCategoryAge();
    public void saveCategoryAgeToy(CategoryAgeToy categoryAgeToy);
    public CategoryAgeToy getCategoryAgeToy( int id);
    public void deleteCategoryAgeToy(int id);
    public Map<String, String> getMapAllCategoryAge();
}
