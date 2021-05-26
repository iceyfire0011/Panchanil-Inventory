package com.ERP.Inventory.config.constantEnums;

import lombok.Getter;

public enum UserType {

	CUSTOMER(2), EMPLOYEE(1), SUPPLIER(3);

	@Getter
	public final int value;

	private UserType(int value) {
		this.value = value;
	}

}
