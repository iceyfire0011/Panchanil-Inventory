package com.ERP.Inventory.config.constantEnums;

import lombok.Getter;

public enum Roles {
		SUPER_ADMIN(1), ADMIN(2), MANAGER(3), STAFF(4);

	@Getter
	public final int value;

	private Roles(int value) {
		this.value = value;
	}
}
