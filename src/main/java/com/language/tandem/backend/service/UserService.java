package com.language.tandem.backend.service;

import com.language.tandem.backend.model.User;
import com.language.tandem.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUserList() {
        return userRepository.findAll();
    }

    public User getUserWithId(Integer id) {
        return userRepository.findUserById(id);
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }
}
