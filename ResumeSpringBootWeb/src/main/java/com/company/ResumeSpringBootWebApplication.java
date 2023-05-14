package com.company;

import com.company.dao.inter.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ResumeSpringBootWebApplication {

    @Autowired
    UserRepository userRepo;

    public static void main(String[] args) {
        SpringApplication.run(ResumeSpringBootWebApplication.class, args);

    }

}
