package com.example.Bizo.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name="products")

public class Product {

    @Id
    @GeneratedValue
    private long id;


    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private int quantity;


}
