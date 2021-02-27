package com.ERP.Inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.ERP.Inventory.Model.User;
import com.ERP.Inventory.config.constant.PropertyConstants;

@SpringBootApplication
@EnableAutoConfiguration
@EnableMongoRepositories
public class PanchanilApplication {

	public static void main(String[] args) {
		
		
		
		SpringApplication.run(PanchanilApplication.class, args);
	}

}
