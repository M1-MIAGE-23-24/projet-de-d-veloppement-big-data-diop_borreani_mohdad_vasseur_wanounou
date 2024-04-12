package fr.miage.m1.big_data_m1_23_24.controllers;

import fr.miage.m1.big_data_m1_23_24.entity.User;
import fr.miage.m1.big_data_m1_23_24.services.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fileUsers")
public class UserFileController {

    private final UserService userService;

    public UserFileController(@Qualifier("userServiceFileImpl") UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/{id}")
    public User getUser(@PathVariable Long id)
    {
        return userService.get(id);
    }

    @GetMapping(value = "/")
    public List<User> getUsers()
    {
        return userService.getAll();
    }
}
