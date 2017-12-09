package com.thisistime.springboot.jwt.integration.repository;

import com.thisistime.springboot.jwt.integration.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
