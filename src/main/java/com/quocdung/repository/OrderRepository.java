package com.quocdung.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quocdung.entity.Order;
@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{
	Order findOneById(Integer id);
}
