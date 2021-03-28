package com.ERP.Inventory.Model;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.ERP.Inventory.config.ObjectToJson;

import lombok.Data;

@Document(collection = "departments") @Data
public class Department {

	@Id
	private String id;
	private String DepartmentName;
	private String Location;
	@NotNull(message = "Authentication cannot be null")
	private Authentication Authentiction;

	public Department() {
		id = new ObjectId().toString();
	}

	@Override
	public String toString() {
		return new ObjectToJson().GetJsonFromObject(this);
	}
}
