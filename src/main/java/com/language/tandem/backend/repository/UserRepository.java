package com.language.tandem.backend.repository;

import com.language.tandem.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAll();

    User findUserById(Integer id);

    User findUserByName(String name);

    boolean existsByName(String name);

}
