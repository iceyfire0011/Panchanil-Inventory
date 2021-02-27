package com.ERP.Inventory.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ERP.Inventory.Model.User;

@Repository
public interface IUserRepository extends MongoRepository<User, String> {

}
