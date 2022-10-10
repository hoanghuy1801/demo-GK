package com.example.demogk.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demogk.entity.Order;
import com.example.demogk.service.OrderService;

@RestController
@RequestMapping("/api")
public class OrderController {
	@Autowired
	private OrderService orderService;


	@PostMapping("/createOrder")
	public Order createOrder(@RequestBody Order order) {

		 return orderService.createOrder(order);
		
	}

}
