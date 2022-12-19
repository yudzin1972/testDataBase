package com.example.testDataBase.repository;

import com.example.testDataBase.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserEntity,Long> {
    UserEntity findByName (String name);
}
