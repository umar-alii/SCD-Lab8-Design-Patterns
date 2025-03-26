package com.Design_Pattern.Lab8.Repository;


import com.Design_Pattern.Lab8.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
