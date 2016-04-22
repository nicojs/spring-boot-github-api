package com.example.rest;

import com.example.dto.GitHubUsersResponse;
import com.example.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class UsersController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/users")
    public List<User> repositories(@RequestParam(name = "q") String query) {
        ResponseEntity<GitHubUsersResponse> forEntity =
                restTemplate.getForEntity(String.format("https://api.github.com/search/users?q=%s", query), GitHubUsersResponse.class);
        return forEntity.getBody().getItems();
    }
}
