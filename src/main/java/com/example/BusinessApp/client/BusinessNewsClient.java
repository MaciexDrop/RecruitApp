package com.example.BusinessApp.client;

import com.example.BusinessApp.domain.Articles;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BusinessNewsClient {

    List<Articles> getNews();
}
