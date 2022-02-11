package com.example.BusinessApp.repository;

import com.example.BusinessApp.client.PolishBusinessNewsClient;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;


@Component
public class TxtRepository implements Repository {

    @Override
    public void saveAll(String fileName) {

        final String path = "C:\\Users\\macwl\\IdeaProjects\\BusinesApp\\src\\main\\resources\\";
        {
            try {
                FileWriter writer = new FileWriter(path + fileName +".txt");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
