package com.ERP.Inventory.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ERP.Inventory.Model.Department;

@Repository
public interface IDepartmentRepository extends MongoRepository<Department, String> {

}
