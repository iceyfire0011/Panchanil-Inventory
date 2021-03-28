package com.ERP.Inventory.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ERP.Inventory.Model.Role;

@Repository
public interface IRoleRepository extends MongoRepository<Role, String>{

}
