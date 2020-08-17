package com.altimetrik.ee.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.altimetrik.ee.demo.entity.OrderSummary;

@Repository
public interface OrderRepository extends JpaRepository<OrderSummary,Integer>{

}
