package com.Design_Pattern.Lab8;

import com.Design_Pattern.Lab8.FactoryClass.productfactory;
import com.Design_Pattern.Lab8.interfaces.product;

public class Main {
    public static void main(String[] args) {
        product p1 = productfactory.createproduct("books");
        p1.displaydetails();
        product p2 = productfactory.createproduct("electronics");
        p2.displaydetails();
        product p3 = productfactory.createproduct("clothing");
        p3.displaydetails();
    }
}
