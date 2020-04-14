package com.example.SpringMySQL.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.SpringMySQL.dao.OrdersRepository;
import com.example.SpringMySQL.model.Order;


@RestController
@RequestMapping("/order")
public class OrdersController {
    @Autowired
    private OrdersRepository dao;

    @PostMapping("/bookOrders") //ur putting stuff in the table
    public String bookOrder(@RequestBody List<Order> orders) {
        dao.save(orders);
        return "order inserted : " + orders.size();
    }

    @GetMapping("/getTickets")  //U wanna get the whole list/table
    public List<Order> getTickets() {
        return (List<Order>) dao.findAll();
    }
}

