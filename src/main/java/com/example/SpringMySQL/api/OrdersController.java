package com.example.SpringMySQL.api;

import java.util.List;
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
    private OrdersRepository dataccess;
    private Order someorder = new Order();

    @PostMapping("/bookOrders") //ur putting stuff in the table, List<Order> orders
    public String bookOrder(@RequestBody Order someorder) {
        someorder.setId(1);
        someorder.setId_raw(1);
        someorder.setOrder_id("1");
        someorder.setCustomer("Nat");
        someorder.setType("Null");
        someorder.setShip_to("His home");
        someorder.setShip_to_address("344 Kings road");
        someorder.setShip_by_date("2020-11-02");
        someorder.setPack_by_date("2020-08-01");
        someorder.setInhouse_date("2020-12-05");
        someorder.setPo_date("2020-12-05");
        someorder.setJob_date("2020-12-05");
        someorder.setSource_facility("Home Depot");
        someorder.setShip_via("UPS");
        someorder.setPart_number("32");
        someorder.setPart_quantity(6);
        someorder.setPart_description("Office Chair");
        someorder.setEscalate("Null");
        someorder.setJob_required("Null");
        someorder.setLine2("Null");
        someorder.setResponse_accept("Null");
        someorder.setEpicor_order_id(6);
        someorder.setJob_number("18");
        someorder.setDate_created("2020-03-01 22:30:23");
        someorder.setDate_updated("2020-03-01 22:30:23");
        someorder.setDate_picked_up("2020-03-02 01:15:03");
        someorder.setDate_completed("2020-03-01 22:30:23");
        someorder.setTime_taken("03:22:40");
        someorder.setRetrieve_count(6);
        someorder.setAudit_status("In Progress");

        dataccess.save(someorder);
        return "order booked for  " + someorder.getCustomer();
    }

    @GetMapping("/getTickets")  //U wanna get the whole list/table
    public List<Order> getTickets() {
        return (List<Order>) dataccess.findAll();
    }
}

