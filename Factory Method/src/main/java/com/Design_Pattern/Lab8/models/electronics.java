package com.Design_Pattern.Lab8.models;

import com.Design_Pattern.Lab8.interfaces.product;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class electronics implements product {
    private String name="Air Conditioner";
    private int price=5000;
    @Override
    public void displaydetails() {
        log.info("This is Product Details");
        log.info("Product Name: {}", name);
        log.info("Product Price: {}", price);
    }
}
