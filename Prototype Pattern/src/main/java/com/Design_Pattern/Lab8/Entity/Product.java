package com.Design_Pattern.Lab8.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product implements Cloneable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String category;
    private Double price;
    private String color;

    @Override
    public Product clone() {
        try {
            Product clonedProduct = (Product) super.clone();

            clonedProduct.setId(null);
            return clonedProduct;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Failed to clone product", e);
        }
    }


}
