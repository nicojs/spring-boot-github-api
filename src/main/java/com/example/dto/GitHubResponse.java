package com.example.dto;

import lombok.Data;

import java.util.List;

@Data
class GitHubResponse<T> {
    private List<T> items;
}
