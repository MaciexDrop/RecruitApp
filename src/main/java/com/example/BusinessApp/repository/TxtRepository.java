package com.example.BusinessApp.repository;

import java.io.FileWriter;
import java.io.IOException;



@org.springframework.stereotype.Repository
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
