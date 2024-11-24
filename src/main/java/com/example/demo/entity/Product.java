package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String description;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    public void setCategory(Category category) {
        this.category = category;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name= name.toString();
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description.toString();
    }

}
