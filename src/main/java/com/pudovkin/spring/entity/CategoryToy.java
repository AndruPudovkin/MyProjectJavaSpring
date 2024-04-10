package com.pudovkin.spring.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(schema = "my_project", name = "category_toys")
public class CategoryToy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "category_toy")
    private String categoryName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoryToy")
    private List<Toy> toys;

    public CategoryToy() {
    }

    public CategoryToy(String categoryName) {
        this.categoryName = categoryName;
    }

    public void AddToyToCategory(Toy toy){
        if(toys == null){
            toys = new ArrayList<>();
        }
        toys.add(toy);
        toy.setCategoryToy(this);
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
