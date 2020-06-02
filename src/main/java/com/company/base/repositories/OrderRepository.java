package com.company.base.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.base.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
