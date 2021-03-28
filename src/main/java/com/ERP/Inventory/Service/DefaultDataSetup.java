package com.ERP.Inventory.Service;

import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;

import com.ERP.Inventory.IRepository.IAuthenticationRepository;
import com.ERP.Inventory.IRepository.IDepartmentRepository;
import com.ERP.Inventory.IRepository.IEmployeeRepository;
import com.ERP.Inventory.IRepository.IPermissionRepository;
import com.ERP.Inventory.IRepository.IRoleRepository;
import com.ERP.Inventory.IRepository.IUserRepository;
import com.ERP.Inventory.Model.Authentication;
import com.ERP.Inventory.Model.Department;
import com.ERP.Inventory.Model.Employee;
import com.ERP.Inventory.Model.Permission;
import com.ERP.Inventory.Model.Role;
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
	@Autowired
	IRoleRepository _roleRepository;
	@Autowired
	IPermissionRepository _permissionRepository;

	@Autowired
	private ResourceLoader resourceLoader;

	public DefaultDataSetup() {

	}

	public Response projectConfigSetup() {
		// String data = "";
		// Resource resource =
		// resourceLoader.getResource("classpath:static/config.json");
		// try (Reader reader = new InputStreamReader(resource.getInputStream(),
		// "UTF-8")) {
		// data=FileCopyUtils.copyToString(reader);
		//
		// } catch (IOException e) {
		// throw new UncheckedIOException(e);
		// }

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
		Department department = new Department() {
			{
				setAuthentiction(activeAuthProperties);
				setDepartmentName("Master");
				setLocation("Dhaka");
			}
		};
		_departmentRepository.save(department);
		List<Department> departments = new LinkedList<Department>();
		departments.add(department);

		Role role = new Role() {{
			setAuthentiction(activeAuthProperties);
			setRoleName("Super Admin");
		}};
		_roleRepository.save(role);
		List<Role> roles = new LinkedList<Role>();
		roles.add(role);
		
		Permission permission = new Permission() {{
			setAuthentiction(activeAuthProperties);
			setMenueName("*");
			setControllerName("*");
			setMenueName("*");
			setMethodName("*");
		}};
		_permissionRepository.save(permission);
		List<Permission> permissions = new LinkedList<Permission>();
		permissions.add(permission);
		
		Employee superUser = new Employee() {
			{
				setDesignation("Super Admin");
				setUser(defaultUser);
				setDepartments(departments);
				setRoles(roles);
				setPermissions(permissions);
			}
		};
		_employeeRepository.save(superUser);

		Response response = new Response();
		response.setMessage(
			activeAuthProperties + "\n" + inactiveAuthProperties + "\n" + department + "\n" + defaultUser + "\n"
				+ superUser + "\n"
		);
		// Response response = new Response();
		// response.setMessage(data);

		return response;
	}

}
