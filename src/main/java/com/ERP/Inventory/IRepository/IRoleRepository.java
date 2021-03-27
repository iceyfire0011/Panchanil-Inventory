package com.ERP.Inventory.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ERP.Inventory.Model.Role;

public interface IRoleRepository extends MongoRepository<Role, String>{

}
