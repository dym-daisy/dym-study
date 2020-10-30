package com.dym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppServiceDental {

    public static void main(String[] args) {
        try {
            SpringApplication.run(AppServiceDental.class,args);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

