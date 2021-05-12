package com.euser.userservice.controller;

import com.euser.userservice.entity.User;
import com.euser.userservice.service.UserService;
import com.euser.userservice.vo.ResponceTemplatevo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        log.info("Inside saveUser method of UserController");
        return userService.saveUser(user);

    }

    @GetMapping("/{id}")
    public ResponceTemplatevo getdepartmentwithuser(@PathVariable("id") Long userId) {
        return userService.getdepartmentwithuser(userId);
    }


}
