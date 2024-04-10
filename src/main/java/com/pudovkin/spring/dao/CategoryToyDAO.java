package com.pudovkin.spring.dao;


import com.pudovkin.spring.entity.CategoryAgeToy;
import com.pudovkin.spring.entity.CategoryToy;

import java.util.List;
import java.util.Map;

public interface CategoryToyDAO {
    public List<CategoryToy> getAllCategoryToy();
    public void seveCategory(CategoryToy categoryToy);
    public CategoryToy getCategory(int id);
    public void deleteCategory(int id);
    public Map<String, String> getMapAllCategory();
}
