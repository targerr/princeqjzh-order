package edu.virgil.docker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import edu.virgil.docker.entity.User;
import edu.virgil.docker.service.UserService;

/**
 * @author virgil.Wang
 * @date 2019/7/25 16:54
 */
@RestController
public class IndexController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String defaultIndex() {
        return "hello docker, I am virgil!";
    }

    @GetMapping("/index")
    public String index() {
        return "hello docker, I am virgil!";
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable("id") Long id) {
        return userService.getById(id);
    }

}
