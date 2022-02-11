package com.example.BusinessApp.domain;

import lombok.Data;

@Data
public class News {

    private String status;
    private Integer totalResults;
    private Articles[] articles;

}
