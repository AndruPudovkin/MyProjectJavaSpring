package com.pudovkin.spring.dao;


import com.pudovkin.spring.entity.CategoryToy;
import com.pudovkin.spring.entity.ManufacturerToy;

import java.util.List;
import java.util.Map;

public interface ManufacturerToyDAO {
    public List<ManufacturerToy> getAllManufacturerToy();
    public void seveManufacturerToy(ManufacturerToy manufacturerToy);
    public ManufacturerToy getManufacturerToy(int id);
    public void deleteManufacturerToy(int id);
    public Map<String, String> getMapAllManufacturerToy();
}
