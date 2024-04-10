package com.pudovkin.spring.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(schema = "my_project", name = "material_toys")
public class MaterialToy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "material")
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "materialToy")
    private List<Toy> toys;

    public MaterialToy() {
    }

    public MaterialToy(String materialName) {
        this.categoryName = materialName;
    }

    public void addToyToMaterial(Toy toy){
        if (toys == null){
            toys = new ArrayList<>();
        }
        toys.add(toy);
        toy.setMaterialToy(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String materialName) {
        this.categoryName = materialName;
    }

}
