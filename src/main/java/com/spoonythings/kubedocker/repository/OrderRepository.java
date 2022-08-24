package com.spoonythings.kubedocker.repository;

import com.spoonythings.kubedocker.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
