package edu.virgil.docker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import edu.virgil.docker.entity.User;
import edu.virgil.docker.service.UserService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

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
    public Map<String,Object> getUserById(@PathVariable("id") Long id) {
        Map<String,Object> result = new HashMap<>();
        LocalDateTime now = LocalDateTime.now();

        String s7 = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        result.put("user",userService.getById(id));
        result.put("message","success");
        result.put("time",s7);
        result.put("text","哈哈");
        return result;
    }

}
