package com.ERP.Inventory.config.constantEnums;

import lombok.Getter;

public enum UserType {

		EMPLOYEE(1), CUSTOMER(2), SUPPLIER(3);

	@Getter
	public final int value;

	private UserType(int value) {
		this.value = value;
	}

}
