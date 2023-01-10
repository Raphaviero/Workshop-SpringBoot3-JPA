package com.projetoPessoal.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoPessoal.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
