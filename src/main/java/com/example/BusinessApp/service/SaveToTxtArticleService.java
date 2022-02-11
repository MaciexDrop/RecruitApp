package com.example.BusinessApp.service;

import com.example.BusinessApp.domain.Articles;
import com.example.BusinessApp.client.BusinessNewsClient;
import com.example.BusinessApp.repository.Repository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class SaveToTxtArticleService implements SaveArticleService {

    private final BusinessNewsClient businessNewsClient;
    private final Repository repository;


    @Override
    public void save() {
        List<Articles> articlesList = businessNewsClient.getNews();
        repository.saveAll(articlesList);
        return;
    }
}
