package com.ERP.Inventory.Model;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import com.ERP.Inventory.config.ObjectToJson;

import lombok.Data;

@Document(collection = "roles") @Data
public class Role {

	private String id;
	private String roleName;
	
	
	public Role() {
		id = new ObjectId().toString();
	}
	
	@Override
	public String toString() {
		return new ObjectToJson().GetJsonFromObject(this);
	}
}
