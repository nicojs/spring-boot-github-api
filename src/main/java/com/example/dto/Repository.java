package com.example.dto;

import lombok.Data;

@Data
public class Repository {
    private String name;
    private User owner;
    private String url;
}
