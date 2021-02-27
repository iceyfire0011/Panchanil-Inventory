package com.ERP.Inventory.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ERP.Inventory.Model.Authentication;

@Repository
public interface IAuthenticationRepository extends MongoRepository<Authentication, String>{

}
