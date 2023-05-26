package com.company;

import com.company.dao.inter.UserDAOInter;
import com.company.dao.inter.UserRepository;
import com.company.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@SpringBootApplication
public class ResumeAppSpringJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResumeAppSpringJpaApplication.class, args);
    }

    @Autowired
    private UserDAOInter userDao;

    @Bean
    public CommandLineRunner run() {
        CommandLineRunner clr = new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                User u = userDao.getById(1);
                System.out.println(u);
                u.setPassword("99999");
                System.out.println(u);
            }
        };

        return clr;
    }
}


