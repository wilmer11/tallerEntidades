package com.keycode.minitas.jpa.repository;


import com.keycode.comun.entidades.jpa.entity.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmail(String email);
}
