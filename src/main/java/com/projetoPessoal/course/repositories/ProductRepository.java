package com.projetoPessoal.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoPessoal.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
