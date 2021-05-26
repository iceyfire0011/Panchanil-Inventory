package com.ERP.Inventory.config.constantEnums;

import lombok.Getter;

public enum Months {
	APRIL(4), AUGUST(8), DECEMBER(12), FEBRUARY(2),
	/**
	 * Values for name of months. Store and deal values on database for the defined months
	 */
	JANUARY(1), JULY(7), JUNE(6), MARCH(3), MAY(5), NOVEMBER(11),
	OCTOBER(10), SEPTEMBER(9);

	@Getter
	public final int value;

	Months(int values) {
		this.value = values;
	}
}
