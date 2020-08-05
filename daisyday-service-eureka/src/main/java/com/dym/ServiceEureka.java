package com.dym;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceEureka {

    protected static final Logger logger = LoggerFactory.getLogger(ServiceEureka.class);

    public static void main(String[] args) {
        try {
            SpringApplication.run(ServiceEureka.class,args);
        }catch (Exception e){
            e.printStackTrace();
            logger.error(e.toString());
        }

    }
}
