package com.example.SpringMySQL.dao;
import org.springframework.data.repository.CrudRepository;

import com.example.SpringMySQL.model.Order;

public interface OrdersRepository extends CrudRepository<Order, Integer> {
}





