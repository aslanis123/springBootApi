package com.language.tandem.backend.controller;

import com.language.tandem.backend.model.User;
import com.language.tandem.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    @ResponseBody
    public List<User> getAllUsers(){
        return userService.getUserList();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public User getUserByID(@PathVariable Integer id){
        return userService.getUserWithId(id);
    }

    @PostMapping("/new-user")
    public void newUser(@RequestBody User user) {
        userService.saveUser(user);
    }
}
