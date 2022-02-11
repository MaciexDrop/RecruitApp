package com.example.BusinessApp.repository;

import com.example.BusinessApp.domain.Articles;

import java.util.List;

public interface Repository {

    void saveAll(String location, List<Articles> articlesList);
}
