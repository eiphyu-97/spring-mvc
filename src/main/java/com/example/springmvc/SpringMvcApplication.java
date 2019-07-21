package com.example.springmvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import sun.tools.jar.CommandLine;

import java.util.Arrays;

@SpringBootApplication
public class SpringMvcApplication {

    private static Logger logger= LoggerFactory.getLogger(SpringMvcApplication.class);

    @Autowired
    private ApplicationContext applicationContext;

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcApplication.class, args);
    }

    @Bean @Profile("dev")
    public CommandLineRunner run(){
        return args -> {
            logger.info("Welcome Spring MVC");
            logger.error("Simple logger message");
            logger.info("Simple logger message");
            logger.warn("Simple logger message");
            logger.debug("Simple logger message");
            logger.trace("Simple logger message");
            Arrays.stream(this.applicationContext.getBeanDefinitionNames())
                    .sorted().forEach(System.out::println);
        };
    }

}
