package com.pudovkin.spring.dao;

import com.pudovkin.spring.entity.CategoryAgeToy;


import java.util.List;
import java.util.Map;


public interface CategoryAgeDAO  {
    public List<CategoryAgeToy> getAllCategoryAge();
    public void seveCategoryAge(CategoryAgeToy categoryAgeToy);
    public CategoryAgeToy getCategoryAge(int id);
    public void deleteCategoryAge(int id);
    public Map<String, String> getMapAllCategoryAge();
}
