package com.example.testDataBase.repository;

import com.example.testDataBase.entity.TempEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

public interface TempEntityRepo extends CrudRepository<TempEntity,Long> {
    TempEntity findByD1 (Date d1);
}
