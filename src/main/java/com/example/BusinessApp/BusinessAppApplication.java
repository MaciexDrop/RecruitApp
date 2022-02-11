package com.example.BusinessApp;

import com.example.BusinessApp.client.PolishBusinessNewsClient;
import com.example.BusinessApp.repository.TxtRepository;
import com.example.BusinessApp.service.SaveToTxtArticleService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.Reader;
import java.util.Scanner;

@SpringBootApplication
public class BusinessAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusinessAppApplication.class, args);

        PolishBusinessNewsClient polishBusinessNewsClient = new PolishBusinessNewsClient();
        TxtRepository repository = new TxtRepository();
        SaveToTxtArticleService saveArticlesToFile = new SaveToTxtArticleService(polishBusinessNewsClient, repository);

        saveArticlesToFile.save();


    }


}
