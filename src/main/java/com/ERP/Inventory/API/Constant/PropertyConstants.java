package com.ERP.Inventory.API.Constant;

import com.ERP.Inventory.config.constantEnums.ActiveStatus;
import com.ERP.Inventory.config.constantEnums.Months;
import com.ERP.Inventory.config.constantEnums.Roles;
import com.ERP.Inventory.config.constantEnums.UserType;
import com.ERP.Inventory.config.constantEnums.WeekDay;

public final class PropertyConstants {

	// user
	public static final String FIRSTNAME = "MD.";
	public static final String LASTNAME = "Super Admin";
	public static final String SUPERUSERNAME = "superadmin";
	public static final String PASSWORD = "1234";
	public static final int ACTIVE = ActiveStatus.ACTIVE.getValue(); // Authorization status
	public static final int INACTIVE = ActiveStatus.INACTIVE.getValue(); // Authorization status
	public static final String PHONENO = "01931250325";
	public static final String PRESENTADDRESS = "Shyamoly, Dhaka";
	public static final String PERMANENTADDRESS = "Mirpur, Dhaka";

	// user types
	public static final int EMPLOYEE = UserType.EMPLOYEE.getValue();
	public static final int CUSTOMER = UserType.CUSTOMER.getValue();
	public static final int SUPPLIER = UserType.SUPPLIER.getValue();

	// user roles
	public static final int SUPERADMIN = Roles.SUPERADMIN.getValue();
	public static final int ADMIN = Roles.ADMIN.getValue();
	public static final int MANAGER = Roles.MANAGER.getValue();
	public static final int STAFF = Roles.STAFF.getValue();

	// WeekDay
	public static final int FRIDAY = WeekDay.FRIDAY.getValue();
	public static final int SATURDAY = WeekDay.SATURDAY.getValue();
	public static final int SUNDAY = WeekDay.SUNDAY.getValue();
	public static final int MONDAY = WeekDay.MONDAY.getValue();
	public static final int TUESDAY = WeekDay.TUESDAY.getValue();
	public static final int WEDNESDAY = WeekDay.WEDNESDAY.getValue();
	public static final int THURSDAY = WeekDay.THURSDAY.getValue();

	// Months
	public static final int JANUARY = Months.JANUARY.getValue();
	public static final int FEBRUARY = Months.FEBRUARY.getValue();
	public static final int MARCH = Months.MARCH.getValue();
	public static final int APRIL = Months.APRIL.getValue();
	public static final int MAY = Months.MAY.getValue();
	public static final int JUNE = Months.JUNE.getValue();
	public static final int JULY = Months.JULY.getValue();
	public static final int AUGUST = Months.AUGUST.getValue();
	public static final int SEPTEMBER = Months.SEPTEMBER.getValue();
	public static final int OCTOBER = Months.OCTOBER.getValue();
	public static final int NOVEMBER = Months.NOVEMBER.getValue();
	public static final int DECEMBER = Months.DECEMBER.getValue();

	public PropertyConstants() {
		// TODO Auto-generated constructor stub
	}

}
