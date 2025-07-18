package com.Saurabh.product.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    @Column(name = "product_name")
    private String name;
    @Column(name = "product_brand")
    private String brand;
    @Column(name = "product_price")
    private long price;
    @Column(name = "product_quantity")
    private int quantity;

}