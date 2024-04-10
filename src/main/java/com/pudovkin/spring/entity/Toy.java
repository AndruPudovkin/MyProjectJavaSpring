package com.pudovkin.spring.entity;

import javax.persistence.*;

@Entity
@Table(schema = "my_project", name = "toys")
public class Toy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name = "name_toy")
    private String nameToy;
    @Column(name = "cost_toy")
    private int costToy;
    @Column(name = "quantity_toy")
    private int quanityToy;
    @Column(name = "gender")
    private String genderToy;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_material")
    private MaterialToy materialToy;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_category_toy")
    private CategoryToy categoryToy;
    @ManyToOne (cascade = CascadeType.REMOVE)
    @JoinColumn(name = "id_category_age")
    private CategoryAgeToy categoryAgeToy;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_manufacturer")
    private ManufacturerToy manufacturerToy;

    public Toy(){}

    public Toy(String nameToy, int costToy, int quanityToy, String gender) {
        this.nameToy = nameToy;
        this.costToy = costToy;
        this.quanityToy = quanityToy;
        this.genderToy = gender;
    }

    public CategoryToy getCategoryToy() {
        return categoryToy;
    }

    public void setCategoryToy(CategoryToy categoryToy) {
        this.categoryToy = categoryToy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameToy() {
        return nameToy;
    }

    public void setNameToy(String nameToy) {
        this.nameToy = nameToy;
    }

    public MaterialToy getMaterialToy() {
        return materialToy;
    }

    public void setMaterialToy(MaterialToy materialToy) {
        this.materialToy = materialToy;
    }

    public int getCostToy() {
        return costToy;
    }

    public void setCostToy(int costToy) {
        this.costToy = costToy;
    }

    public int getQuanityToy() {
        return quanityToy;
    }

    public void setQuanityToy(int quanityToy) {
        this.quanityToy = quanityToy;
    }

    public String getGenderToy() {
        return genderToy;
    }

    public void setGenderToy(String gender) {
        this.genderToy = gender;
    }

    public CategoryAgeToy getCategoryAgeToy() {
        return categoryAgeToy;
    }

    public void setCategoryAgeToy(CategoryAgeToy categoryAgeToy) {
        this.categoryAgeToy = categoryAgeToy;
    }

    public ManufacturerToy getManufacturerToy() {
        return manufacturerToy;
    }

    public void setManufacturerToy(ManufacturerToy manufacturerToy) {
        this.manufacturerToy = manufacturerToy;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", nameToy='" + nameToy + '\'' +
                ", costToy=" + costToy +
                ", quanityToy=" + quanityToy +
                ", gender='" + genderToy + '\'' +
                '}';
    }
}