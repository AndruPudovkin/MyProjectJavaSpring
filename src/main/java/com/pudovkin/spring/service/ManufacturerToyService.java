package com.pudovkin.spring.service;

import com.pudovkin.spring.entity.CategoryToy;
import com.pudovkin.spring.entity.ManufacturerToy;

import java.util.List;
import java.util.Map;

public interface ManufacturerToyService {
    public List<ManufacturerToy> getAllManufacturerToy();
    public void saveManufacturerToy(ManufacturerToy manufacturerToy);
    public ManufacturerToy getManufacturerToy( int id);
    public void deleteManufacturerToy(int id);
    public Map<String, String> getMapAllManufacturerToy();
}
