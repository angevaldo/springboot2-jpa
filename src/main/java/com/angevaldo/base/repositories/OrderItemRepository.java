package com.angevaldo.base.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angevaldo.base.entities.OrderItem;
import com.angevaldo.base.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
