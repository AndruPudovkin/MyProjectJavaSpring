package com.pudovkin.spring.service;



import com.pudovkin.spring.entity.CategoryAgeToy;
import com.pudovkin.spring.entity.CategoryToy;

import java.util.List;
import java.util.Map;

public interface CategoryToyService {
    public List<CategoryToy> getAllCategoryToy();
    public void saveCategoryToy(CategoryToy categoryToy);
    public CategoryToy getCategoryToy( int id);
    public void deleteCategoryToy(int id);
    public Map<String, String> getMapAllCategory();
}
