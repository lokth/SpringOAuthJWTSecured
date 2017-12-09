package com.thisistime.springboot.jwt.integration.repository;

import com.thisistime.springboot.jwt.integration.domain.RandomCity;
import org.springframework.data.repository.CrudRepository;

public interface RandomCityRepository extends CrudRepository<RandomCity, Long> {
}
