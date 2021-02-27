package com.ERP.Inventory.Model;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.ERP.Inventory.config.ObjectToJson;

import lombok.Data;

@Document(collection = "Authentications") @Data
public class Authentication {

	@Id @Indexed
	private String id;
	@NotNull(message = "status cannot be null")
	private int status; // Active, Inactive,
	@NotNull(message = "createdBy cannot be null")
	private String createdBy; // User reference
	@NotNull(message = "createdDate cannot be null")
	private Date createdDate;
	@NotNull(message = "modifyedBy cannot be null")
	private String modifyedBy; // User reference
	@NotNull(message = "modifyedDate cannot be null")
	private Date modifyedDate;

	public Authentication() {
		id = new ObjectId().toString();
	}

	@Override
	public String toString() {
		return new ObjectToJson().GetJsonFromObject(this);
	}

}
