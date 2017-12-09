package com.thisistime.springboot.jwt.integration.service;

import com.thisistime.springboot.jwt.integration.domain.RandomCity;
import com.thisistime.springboot.jwt.integration.domain.User;

import java.util.List;

public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

    List<RandomCity> findAllRandomCities();
}
