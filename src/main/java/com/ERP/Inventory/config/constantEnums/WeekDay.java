package com.ERP.Inventory.config.constantEnums;


import lombok.Getter;

public enum WeekDay {
	FRIDAY(0), MONDAY(3), SATURDAY(1), SUNDAY(2), THURSDAY(6), TUESDAY(4), WEDNESDAY(5);

	@Getter
	private final int value;

	WeekDay(int value) {
		// TODO Auto-generated constructor stub
		this.value = value;
	}

}
