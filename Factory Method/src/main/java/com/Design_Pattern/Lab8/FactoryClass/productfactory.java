package com.Design_Pattern.Lab8.FactoryClass;

import com.Design_Pattern.Lab8.interfaces.product;
import com.Design_Pattern.Lab8.models.Books;
import com.Design_Pattern.Lab8.models.Clothing;
import com.Design_Pattern.Lab8.models.electronics;

public class productfactory {
    public static product createproduct(String name){
        return switch (name.toLowerCase()) {
            case "electronics" -> new electronics();
            case "clothings" -> new Clothing();
            case "books" -> new Books();
            default -> throw new IllegalArgumentException("Invalid product Type: " + name);
        };

    }
}
