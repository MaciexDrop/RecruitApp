package com.example.BusinessApp.client;

import com.example.BusinessApp.domain.Articles;
import com.google.gson.Gson;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

public class PolishBusinessNewsClient implements BusinessNewsClient {

    private final String url = "https://newsapi.org/v2/top-headlines?country=pl&category=business&apiKey=ca752ad6a69347b58227f84d28c94273";

    RestTemplate template = new RestTemplate();
    Gson gson = new Gson();

    @Override
    public List<Articles> getNews() {

        String response = template.getForObject(url,String.class);
        Articles article = gson.fromJson(response,Articles.class);

        return Collections.emptyList();
    }

}
