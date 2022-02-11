package com.example.BusinessApp.repository;

import org.springframework.stereotype.Component;


public interface Repository<T>{

    public void saveAll(T location);
}
