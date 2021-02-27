package com.ERP.Inventory.config.constantEnums;

import lombok.Getter;

public enum ActiveStatus {

		ACTIVE(1), INACTIVE(0);

	@Getter
	private final int value;

	ActiveStatus(int value) {
		this.value = value;
	}

}
