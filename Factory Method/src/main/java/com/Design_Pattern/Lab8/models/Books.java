package com.Design_Pattern.Lab8.models;

import com.Design_Pattern.Lab8.interfaces.product;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Books implements product {
    private final String title="Data Structures and Algorithms";
    private final String author ="Umar Ali";
    private final int price =200;

    @Override
    public void displaydetails(){
        log.info("Clothing Details");
        log.info("Title: {}", title);
        log.info("Author: {}", author);
        log.info("Price: {}", price);
    }
}
