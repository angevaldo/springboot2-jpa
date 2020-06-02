package com.company.base.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.base.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
