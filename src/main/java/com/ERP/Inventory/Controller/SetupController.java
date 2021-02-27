package com.ERP.Inventory.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ERP.Inventory.Service.DefaultDataSetup;

@RestController @RequestMapping(value = "")
public class SetupController {
	@Autowired
	DefaultDataSetup defaultDataSetup;	

	@GetMapping("/setup")
	public String login() {
		return defaultDataSetup.userSetup().getMessage();
	}
	
	public SetupController() {
		// TODO Auto-generated constructor stub
	}

}
