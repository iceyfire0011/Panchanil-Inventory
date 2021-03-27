/**
 * 
 */
package com.ERP.Inventory.Model;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.bson.types.ObjectId;
/**
 * @author Bismillah pc
 */
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.ERP.Inventory.config.ObjectToJson;

import lombok.Data;

@Document(collection = "users") 
@Data
public class User {

	@Id
	private String id;
	@NotNull(message = "firstName cannot be null")
	private String firstName;
	@NotNull(message = "lastName cannot be null")
	private String lastName;
	@NotNull(message = "userType cannot be null")
	private int userType;
	@NotNull(message = "phoneNo cannot be null")
	private String phoneNo[];
	@NotNull(message = "Address cannot be null")
	private String Address[];
	private String Avatar;
	@NotNull(message = "DateOfBirth cannot be null") @Past
	private Date DateOfBirth;
	@NotNull(message = "Authentication cannot be null")
	private Authentication Authentiction;
	private String email;

	public User() {
		id = new ObjectId().toString();
	}

	@Override
	public String toString() {
		return new ObjectToJson().GetJsonFromObject(this);
	}

}
