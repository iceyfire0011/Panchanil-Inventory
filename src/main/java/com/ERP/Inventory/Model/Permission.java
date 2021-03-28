package com.ERP.Inventory.Model;

import javax.validation.constraints.NotNull;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import com.ERP.Inventory.config.ObjectToJson;

import lombok.Data;

@Data
public class Permission {
	@Id
	private String id;
	private String ControllerName;
	private String MethodName;
	private String MenueName;
	@NotNull(message = "Authentication cannot be null")
	private Authentication Authentiction;

	public Permission() {
		id = new ObjectId().toString();
	}

	@Override
	public String toString() {
		return new ObjectToJson().GetJsonFromObject(this);
	}

}
