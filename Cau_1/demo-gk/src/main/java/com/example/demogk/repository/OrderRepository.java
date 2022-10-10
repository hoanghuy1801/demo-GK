package com.example.demogk.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demogk.entity.Order;



@Repository
@Transactional
public interface OrderRepository extends JpaRepository<Order, Long>{
	
//	Order createOrder (Order order);
	//List<Order> getOrder ();

}
