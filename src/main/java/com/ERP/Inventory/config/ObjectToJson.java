package com.ERP.Inventory.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectToJson {

	public ObjectToJson() {

	}

	public String GetJsonFromObject(Object obj) {

		ObjectMapper mapper = new ObjectMapper();
		String jsonString = "";
		try {
			jsonString = mapper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			jsonString = e.getMessage();
		}

		return jsonString;
	}

}
