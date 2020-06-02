package com.angevaldo.base.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angevaldo.base.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
