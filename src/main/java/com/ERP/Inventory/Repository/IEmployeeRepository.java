package com.ERP.Inventory.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ERP.Inventory.Model.Employee;

@Repository
public interface IEmployeeRepository extends MongoRepository<Employee, String>{

}
