package com.example.demogk.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demogk.entity.Order;

public interface OrderService {
	Order createOrder (Order order);
	//List<Order> getOrder ();
}
