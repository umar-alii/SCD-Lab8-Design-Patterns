package com.Design_Pattern.Lab8.models;

import com.Design_Pattern.Lab8.interfaces.product;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Clothing implements product {
    private final String name="Dress Pant";
    private final int price =200;

    @Override
    public void displaydetails() {
        log.info("Clothing Details Details");
        log.info("Name: {}", name);
        log.info("Price: {}", price);
    }
}
