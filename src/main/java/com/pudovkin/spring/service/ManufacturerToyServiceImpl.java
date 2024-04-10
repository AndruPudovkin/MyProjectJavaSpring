package com.pudovkin.spring.service;

import com.pudovkin.spring.dao.ManufacturerToyDAO;
import com.pudovkin.spring.entity.ManufacturerToy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class ManufacturerToyServiceImpl implements ManufacturerToyService{
    @Autowired
    private ManufacturerToyDAO manufacturerToyDAO;
    @Override
    @Transactional
    public List<ManufacturerToy> getAllManufacturerToy() {
        return manufacturerToyDAO.getAllManufacturerToy();
    }

    @Override
    @Transactional
    public void saveManufacturerToy(ManufacturerToy manufacturerToy) {
        manufacturerToyDAO.seveManufacturerToy(manufacturerToy);
    }

    @Override
    @Transactional
    public ManufacturerToy getManufacturerToy(int id) {
        return manufacturerToyDAO.getManufacturerToy(id);
    }

    @Override
    @Transactional
    public void deleteManufacturerToy(int id) {
        manufacturerToyDAO.deleteManufacturerToy(id);
    }

    @Override
    @Transactional
    public Map<String, String> getMapAllManufacturerToy() {
        return manufacturerToyDAO.getMapAllManufacturerToy();
    }
}
