package com.projetoPessoal.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoPessoal.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
