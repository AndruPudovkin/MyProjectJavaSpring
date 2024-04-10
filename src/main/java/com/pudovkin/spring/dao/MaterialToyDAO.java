package com.pudovkin.spring.dao;

import com.pudovkin.spring.entity.ManufacturerToy;
import com.pudovkin.spring.entity.MaterialToy;

import java.util.List;
import java.util.Map;

public interface MaterialToyDAO {
    public List<MaterialToy> getAllMaterialToy();
    public void seveMaterialToy(MaterialToy materialToy);
    public MaterialToy getMaterialToy(int id);
    public void deleteMaterialToy(int id);
    public Map<String, String> getMapAllMaterialToy();
}
