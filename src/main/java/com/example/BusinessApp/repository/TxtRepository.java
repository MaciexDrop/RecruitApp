package com.example.BusinessApp.repository;

import com.example.BusinessApp.domain.Articles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


@Component
public class TxtRepository implements Repository {

    Logger log = LoggerFactory.getLogger(Repository.class);

    @Override
    public void saveAll(String fileName, List<Articles> articlesList) {

        final String path = "C:\\Users\\macwl\\IdeaProjects\\BusinesApp\\src\\main\\resources\\";
        {
            try {
                FileWriter writer = new FileWriter(path + fileName + ".txt");
                for (Articles article : articlesList) {
                    writer.write(article.getTittle() + ":" + article.getDescription() + ":" + article.getAuthor() + "\n");

                }
                writer.close();
            } catch (IOException e) {
                log.error("Error - file exists as directory, cant be created, already exists or cannot be oppened.");
            }

        }
    }

}
