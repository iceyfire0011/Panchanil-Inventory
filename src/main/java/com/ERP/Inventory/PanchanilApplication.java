package com.ERP.Inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.ERP.Inventory.API.Constant.PropertyConstants;
import com.ERP.Inventory.Model.User;

@SpringBootApplication
@EnableAutoConfiguration
@EnableMongoRepositories
public class PanchanilApplication {

	public static void main(String[] args) {
		
		
		
		SpringApplication.run(PanchanilApplication.class, args);
	}

}
