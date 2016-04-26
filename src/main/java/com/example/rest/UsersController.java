package com.example.rest;

import com.example.dto.GitHubUsersResponse;
import com.example.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController()
public class UsersController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/api/users")
    public List<User> search(@RequestParam(name = "q") String query) {
        ResponseEntity<GitHubUsersResponse> forEntity =
                restTemplate.getForEntity(String.format("https://api.github.com/search/users?q=%s", query), GitHubUsersResponse.class);
        return forEntity.getBody().getItems();
    }

    @RequestMapping("/api/users/{login}")
    public User get(@PathVariable("login") String login){
        ResponseEntity<User> forEntity = restTemplate.getForEntity(String.format("https://api.github.com/users/%s", login), User.class);
        return forEntity.getBody();
    }
}
