package com.ERP.Inventory.Model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.ERP.Inventory.config.ObjectToJson;

import lombok.Data;

@Document(collection = "employees") @Data
public class Employee {

	@Id
	private String id;
	@NotNull @NotBlank @NotEmpty
	private String employeeCode;
	@NotNull @NotBlank @NotEmpty
	private int role;
	private String designation;
	@NotNull @NotBlank @NotEmpty
	private String username;
	@NotNull @NotBlank @NotEmpty
	private String password;
	private User user;

	@Override
	public String toString() {
		return new ObjectToJson().GetJsonFromObject(this);
	}

	public Employee() {
		id = new ObjectId().toString();
	}

}
