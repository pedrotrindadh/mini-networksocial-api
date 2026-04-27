package com.pedrotrindade.minisocialnetwork.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pedrotrindade.minisocialnetwork.entities.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
