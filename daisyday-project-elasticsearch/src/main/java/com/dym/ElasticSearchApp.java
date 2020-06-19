package com.dym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElasticSearchApp
{
    public static void main(String[] args) {
        try {
            SpringApplication.run(ElasticSearchApp.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
