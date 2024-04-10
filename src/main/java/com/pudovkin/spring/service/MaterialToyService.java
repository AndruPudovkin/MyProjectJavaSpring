package com.pudovkin.spring.service;

import com.pudovkin.spring.entity.ManufacturerToy;
import com.pudovkin.spring.entity.MaterialToy;

import java.util.List;
import java.util.Map;

public interface MaterialToyService {
    public List<MaterialToy> getAllMaterialToy();
    public void saveMaterialToy(MaterialToy materialToy);
    public MaterialToy getMaterialToy( int id);
    public void deleteMaterialToy(int id);
    public Map<String, String> getMapAllMaterialToy();
}
