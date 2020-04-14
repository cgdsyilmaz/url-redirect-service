package com.cem.cs443.urlredirectservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;

@SpringBootApplication(exclude = {RepositoryRestMvcAutoConfiguration.class})
public class UrlRedirectServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UrlRedirectServiceApplication.class, args);
    }

}
