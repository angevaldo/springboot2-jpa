package com.company.base.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.base.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
