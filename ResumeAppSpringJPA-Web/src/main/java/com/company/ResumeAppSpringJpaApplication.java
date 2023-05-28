package com.company;

import com.company.dao.inter.UserDAOInter;
import com.company.entity.User;
import com.company.service.inter.UserServiceinter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ResumeAppSpringJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResumeAppSpringJpaApplication.class, args);
    }

    @Autowired
    private UserServiceinter userService;

    @Bean
    public CommandLineRunner run() {
        CommandLineRunner clr = new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {

                User u = userService.getById(27);
                System.out.println(u.getEmail() + " " + u.getPassword());
            }
        };

        return clr;
    }
}


