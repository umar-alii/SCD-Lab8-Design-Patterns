package com.Design_Pattern.Lab8.Service;


import com.Design_Pattern.Lab8.Entity.Product;
import com.Design_Pattern.Lab8.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public List<Product> findAll() {
        return productRepository.findAll();
    }


    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }


    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }


    public Product cloneProductWithColor(Long productId, String newColor) {

        Product originalProduct = productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found with ID: " + productId));


        Product clonedProduct = originalProduct.clone();
        clonedProduct.setColor(newColor);
        return productRepository.save(clonedProduct);
    }


    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
}