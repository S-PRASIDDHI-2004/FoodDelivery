package com.example.FoodDelivery;

import com.example.FoodDelivery.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class Controller {

    @Autowired private Service orderService;

    @PostMapping
    public Order placeOrder(@RequestBody DTO dto) {
        return orderService.placeOrder(dto);
    }


    @GetMapping("/{id}")
    public List<Order> getAllOrders(@PathVariable Long id) {
        return orderService.getAllOrders();
    }
}
