package com.angevaldo.base.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angevaldo.base.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
