package com.example.angularjs.data.repository;

import com.example.angularjs.data.entity.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Integer> {
	User findByName(String name);
}