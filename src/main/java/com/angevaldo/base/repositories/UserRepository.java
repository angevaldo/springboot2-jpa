package com.angevaldo.base.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angevaldo.base.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
