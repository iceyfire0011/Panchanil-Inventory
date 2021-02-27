package com.ERP.Inventory.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ERP.Inventory.IRepository.IUserRepository;
import com.ERP.Inventory.Model.User;
import com.ERP.Inventory.config.ObjectToJson;
import com.ERP.Inventory.config.constant.PropertyConstants;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

@RestController @RequestMapping(value = "")
public class UserController {

	@Autowired
	IUserRepository useRepository;

	public UserController() {
	}

	@GetMapping("/user")
	public String login() {
		User user = new User();
		user.setFirstName(PropertyConstants.FIRSTNAME);
		user.setLastName(PropertyConstants.LASTNAME);
		
		System.out.println(user);
		return user.toString();
	}
	
	
	@PostMapping("/user")
	public ResponseEntity<User> createUser(@RequestBody User user) {

		try {
			User user1 = new User();
			User _user = useRepository.save(user1);
			return new ResponseEntity<>(_user, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
