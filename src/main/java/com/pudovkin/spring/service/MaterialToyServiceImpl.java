package com.pudovkin.spring.service;

import com.pudovkin.spring.dao.MaterialToyDAO;
import com.pudovkin.spring.entity.MaterialToy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class MaterialToyServiceImpl implements MaterialToyService {
    @Autowired
    private MaterialToyDAO materialToyDAO;

    @Override
    @Transactional
    public List<MaterialToy> getAllMaterialToy() {
        return materialToyDAO.getAllMaterialToy();
    }

    @Override
    @Transactional
    public void saveMaterialToy(MaterialToy materialToy) {
        materialToyDAO.seveMaterialToy(materialToy);
    }

    @Override
    @Transactional
    public MaterialToy getMaterialToy(int id) {
        return materialToyDAO.getMaterialToy(id);
    }

    @Override
    @Transactional
    public void deleteMaterialToy(int id) {
        materialToyDAO.deleteMaterialToy(id);
    }

    @Override
    @Transactional
    public Map<String, String> getMapAllMaterialToy() {
        return materialToyDAO.getMapAllMaterialToy();
    }
}
