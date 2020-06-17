package com.example.mds.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="equipment")
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "equip_id")
    int id;

    private String equip_name;

    private int quantity;

    @ManyToOne
    @JoinColumn(name="cate_id")
    private Category category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEquip_name() {
        return equip_name;
    }

    public void setEquip_name(String equip_name) {
        this.equip_name = equip_name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "id=" + id +
                ", equip_name='" + equip_name + '\'' +
                ", quantity=" + quantity +
                ", category=" + category +
                '}';
    }
}
