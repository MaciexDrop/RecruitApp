package com.example.BusinessApp.domain;

import lombok.Data;

@Data
public class Articles {

    private Source source;
    private String author;
    private String tittle;
    private String description;
    private String url;
    private String urlToImage;
    private String publishedAt;
    private String content;
}
