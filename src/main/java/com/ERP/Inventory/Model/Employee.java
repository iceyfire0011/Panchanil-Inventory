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
	private String EmployeeCode;
	@DBRef
	private List<Role> Roles;
	private String Designation;
	@NotNull @NotBlank @NotEmpty
	private String Username;
	@NotNull @NotBlank @NotEmpty
	private String Password;
	@DBRef
	private User User;
	private List<Department> Departments;
	private List<Permission> Permissions;
	@NotNull(message = "Authentication cannot be null")
	private Authentication Authentiction;	

	@Override
	public String toString() {
		return new ObjectToJson().GetJsonFromObject(this);
	}

	public Employee() {
		id = new ObjectId().toString();
	}

}
