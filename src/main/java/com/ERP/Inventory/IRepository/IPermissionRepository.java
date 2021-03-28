package com.ERP.Inventory.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ERP.Inventory.Model.Permission;


@Repository
public interface IPermissionRepository extends MongoRepository<Permission, String>{

}
