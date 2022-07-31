package br.com.springboot.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.springboot.model.User;

@RestController
@RequestMapping("/users")
public class UserController {

  private List<User> users = new ArrayList<>();

  @GetMapping("/")
  public User user() {
    User user = new User();
    user.setId(1L);
    user.setName("Welisson");
    user.setUsername("WellHenri");
    return user;
  }

  @PostMapping("/{id}")
  public User user(@RequestBody User user) {
    users.add(user);
    return user;
  }

  @GetMapping("/list")
  public List<User> list() {
    return users;
  }

}
