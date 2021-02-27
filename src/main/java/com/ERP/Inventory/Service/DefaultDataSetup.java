package com.ERP.Inventory.Service;

import java.util.List;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ERP.Inventory.IRepository.IAuthenticationRepository;
import com.ERP.Inventory.IRepository.IDepartmentRepository;
import com.ERP.Inventory.IRepository.IEmployeeRepository;
import com.ERP.Inventory.IRepository.IUserRepository;
import com.ERP.Inventory.Model.Authentication;
import com.ERP.Inventory.Model.Department;
import com.ERP.Inventory.Model.Employee;
import com.ERP.Inventory.Model.User;
import com.ERP.Inventory.config.constant.PropertyConstants;

@Service
public class DefaultDataSetup {

	@Autowired
	IDepartmentRepository _departmentRepository;
	@Autowired
	IAuthenticationRepository _authenticationRepository;
	@Autowired
	IEmployeeRepository _employeeRepository;
	@Autowired
	IUserRepository _userRepository;

	public DefaultDataSetup() {

	}

	public Response userSetup() {
		Date dob = new Date();
		Calendar cal = Calendar.getInstance();
		cal.set(1991, PropertyConstants.MAY, 1);
		dob.setTime(cal.getTimeInMillis());

		String poneNo[] = { "+8801931250325" };
		String adress[] = { "Shyamoli, Dhaka" };

		Authentication activeAuthProperties = new Authentication() {
			{
				setCreatedBy("system");
				setCreatedDate(new Date());
				setStatus(PropertyConstants.ACTIVE);
				setModifyedBy("system");
				setModifyedDate(new Date());
			}
		};
		_authenticationRepository.save(activeAuthProperties);
		Authentication inactiveAuthProperties = new Authentication() {
			{
				setCreatedBy("system");
				setCreatedDate(new Date());
				setStatus(PropertyConstants.INACTIVE);
				setModifyedBy("system");
				setModifyedDate(new Date());
			}
		};
		_authenticationRepository.save(inactiveAuthProperties);
		User defaultUser = new User() {
			{
				setFirstName("Mr.");
				setLastName("SuperAdmin");
				setUserType(PropertyConstants.EMPLOYEE);
				setPhoneNo(poneNo);
				setAddress(adress);
				setDateOfBirth(dob);
				setEmail("s.m.abdulwassae@gmail.com");
				setAuthentiction(activeAuthProperties);
			}
		};
		_userRepository.save(defaultUser);

		Employee superUser = new Employee();
		superUser.setDesignation("Super Admin");
		superUser.setUser(defaultUser);
		_employeeRepository.save(superUser);

		List<Employee> employees = new LinkedList<Employee>();
		employees.add(superUser);
		Department department = new Department() {
			{
				setDepartmentName("Master");
				setLocation("Dhaka");
				setEmployees(employees);
			}
		};
		_departmentRepository.save(department);

		Response response = new Response();
		response.setMessage(
			activeAuthProperties + "\n" + inactiveAuthProperties + "\n" + department + "\n" + defaultUser + "\n"
				+ superUser + "\n"
		);
		return response;
	}

}
