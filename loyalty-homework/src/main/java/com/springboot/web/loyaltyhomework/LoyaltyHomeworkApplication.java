package com.springboot.web.loyaltyhomework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.springboot.web.loyaltyhomework.DAO.UserInputDaoImpl;

@EnableJpaAuditing
@SpringBootApplication
public class LoyaltyHomeworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoyaltyHomeworkApplication.class, args);
	}

}
