package com.ERP.Inventory.Model;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.ERP.Inventory.config.ObjectToJson;

import lombok.Data;

@Document(collection = "employees") @Data
public class Employee {

	@Id
	private String id;
	@NotNull @NotBlank @NotEmpty
	private String employeeCode;
	@DBRef
	private List<Role> roles;
	private String designation;
	@NotNull @NotBlank @NotEmpty
	private String username;
	@NotNull @NotBlank @NotEmpty
	private String password;
	@DBRef
	private User user;

	@Override
	public String toString() {
		return new ObjectToJson().GetJsonFromObject(this);
	}

	public Employee() {
		id = new ObjectId().toString();
	}

}
