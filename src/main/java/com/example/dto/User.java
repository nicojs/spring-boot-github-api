package com.example.dto;

import lombok.Data;

@Data
public class User {
    private String login;
    private int id;
    private String avatarUrl;
    private String url;
}
