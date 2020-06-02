package com.company.base.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.base.entities.OrderItem;
import com.company.base.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
