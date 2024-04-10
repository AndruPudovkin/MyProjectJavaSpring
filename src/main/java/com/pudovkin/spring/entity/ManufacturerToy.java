package com.pudovkin.spring.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(schema = "my_project", name = "manufacturer_toys")
public class ManufacturerToy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "manufacturer")
    private String categoryName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "manufacturerToy")
    private List<Toy> toys;

    public ManufacturerToy() {
    }

    public ManufacturerToy(String manufacturerName) {
        this.categoryName = manufacturerName;
    }
    public void AddToyToManufacturer(Toy toy){
        if(toys == null){
            toys = new ArrayList<>();
        }
        toys.add(toy);
        toy.setManufacturerToy(this);
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String manufacturerName) {
        this.categoryName = manufacturerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
