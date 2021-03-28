package com.ERP.Inventory.Model;

import javax.validation.constraints.NotNull;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.ERP.Inventory.config.ObjectToJson;

import lombok.Data;

@Document(collection = "roles") @Data
public class Role {

	@Id @Indexed
	private String id;
	private String RoleName;
	@NotNull(message = "Authentication cannot be null")
	private Authentication Authentiction;

	
	public Role() {
		id = new ObjectId().toString();
	}
	
	@Override
	public String toString() {
		return new ObjectToJson().GetJsonFromObject(this);
	}
}
