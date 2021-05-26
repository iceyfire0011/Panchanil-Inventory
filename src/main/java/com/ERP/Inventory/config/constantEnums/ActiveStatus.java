package com.ERP.Inventory.config.constantEnums;

import lombok.Getter;

public enum ActiveStatus {

	ACTIVE(1), APPROVED(4), DELETED(2), INACTIVE(3), REJECTED(5);

	@Getter
	private final int value;

	ActiveStatus(int value) {
		this.value = value;
	}

}
