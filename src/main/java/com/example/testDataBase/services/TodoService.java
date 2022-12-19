package com.example.testDataBase.services;

import com.example.testDataBase.entity.TodoEntity;
import com.example.testDataBase.entity.UserEntity;
import com.example.testDataBase.repository.TodoRepo;
import com.example.testDataBase.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TodoService {
    @Autowired
    private TodoRepo todoRepo;
    @Autowired
    private UserRepo userRepo;

    public TodoEntity addTodo(TodoEntity todo, Long userid) {
        UserEntity user = userRepo.findById(userid).get();
        todo.setUser(user);
        return todoRepo.save(todo);
    }

    public TodoEntity completeTodo(Long id) {
        TodoEntity todo = todoRepo.findById(id).get();
        todo.setCompleted(!todo.isCompleted());
        return todoRepo.save(todo);
    }
}
