package com.ERP.Inventory.config.constantEnums;


import lombok.Getter;

public enum WeekDay {
		FRIDAY(0), SATURDAY(1), SUNDAY(2), MONDAY(3), TUESDAY(4), WEDNESDAY(5), THURSDAY(6);

	@Getter
	private final int value;

	WeekDay(int value) {
		// TODO Auto-generated constructor stub
		this.value = value;
	}

}
