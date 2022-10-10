package com.example.demogk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demogk.entity.Order;
import com.example.demogk.repository.OrderRepository;
@Service
public class OrderServiceImp  implements OrderService{
	@Autowired
	private OrderRepository orderRepository;

//	public OrderServiceImp(OrderRepository theOrderRepository) {
//		orderRepository=theOrderRepository;
//		// TODO Auto-generated constructor stub
//	}

	@Override
	public Order createOrder(Order order) {
		// TODO Auto-generated method stub
		return orderRepository.save(order);
	}

	@Override
	public List<Order> getOrder() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

}
