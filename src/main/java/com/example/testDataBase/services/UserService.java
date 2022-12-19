package com.example.testDataBase.services;

import com.example.testDataBase.entity.UserEntity;
import com.example.testDataBase.exception.UserAllreadyExistsException;
import com.example.testDataBase.exception.UserNotFindAllExeption;
import com.example.testDataBase.model.User;
import com.example.testDataBase.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    public UserEntity addUser(UserEntity user) throws UserAllreadyExistsException {
        if(userRepo.findByName(user.getName())!=null){
            throw new UserAllreadyExistsException("Пользователь уже существует!");
        }
       return userRepo.save(user);
    }

    public List<User> getAllUsers() throws UserNotFindAllExeption {

        List<User> users = new ArrayList<>();
        userRepo.findAll().forEach(ue->{
            users.add(new User().toModel(ue));
        });
        if(users.size()==0){
            throw new UserNotFindAllExeption("Пользователи не существуют!");
        }
        return users;
    }
}
