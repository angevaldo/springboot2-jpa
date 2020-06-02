package com.angevaldo.base.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angevaldo.base.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
