package com.ERP.Inventory.config.constantEnums;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import com.ERP.Inventory.config.ObjectToJson;

import lombok.Data;

@Data
public class Permission {
	@Id
	private String id;
	private String permissionName;
	private String url;
	
	public Permission() {
		id = new ObjectId().toString();
	}
	@Override
	public String toString() {
		return new ObjectToJson().GetJsonFromObject(this);
	}
}
