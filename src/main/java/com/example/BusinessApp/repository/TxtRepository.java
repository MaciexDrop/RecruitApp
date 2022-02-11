package com.example.BusinessApp.repository;

import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;


@Component
public class TxtRepository implements Repository<String>{

    @Override
    public void saveAll(String location) {
        FileWriter writer;
        {
            try {
                writer = new FileWriter("/ddd.txt");


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
