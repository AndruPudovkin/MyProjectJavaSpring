package com.pudovkin.spring.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Entity
@Table(schema = "my_project", name = "category_age_toys")
public class CategoryAgeToy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_age")
    private int id;
    @Column(name = "category_age")
    private String categoryName;
    @OneToMany(cascade = CascadeType.ALL,
             mappedBy = "categoryAgeToy")

    private List<Toy> toys;

    public CategoryAgeToy() {
    }

    public CategoryAgeToy(String categoryAgeName) {
        this.categoryName = categoryAgeName;
    }

    public void AddToyToCategoryAge(Toy toy){
        if(toys == null){
            toys = new ArrayList<>();
        }
        toys.add(toy);
        toy.setCategoryAgeToy(this);
    }
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryAgeName) {
        this.categoryName = categoryAgeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
